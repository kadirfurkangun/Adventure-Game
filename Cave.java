package creature;

public class Cave extends battleLoc {

	public Cave(Character character, Obstacle obstacle) {
		super(character,"Mağara", obstacle);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onLocation(Character character) throws InterruptedException {
		// TODO Auto-generated method stub
		super.onLocation(character);
		combat();
	}
// savaş algoritmasını yazacaksak öncelikle 
	@Override
	public boolean combat() throws InterruptedException {
		if(super.combat()==true) {
			System.out.println("Savaşı Kazandınız!!!");
			this.getCharacter().getInventory().setWater(true);
			System.out.print(" Su :)");
			return true;
		}
		System.out.println("Malesef");
			return false;
	}

}
