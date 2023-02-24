package creature;

public class Forest extends battleLoc {

	public Forest(Character character, Obstacle obstacle) {
		super(character,"Orman", obstacle);
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
			this.getCharacter().getInventory().setBread(true);
			System.out.println("Ekmek :)");
			return true;
		}
		System.out.println("Malesef");
			return false;
	}
	

}
