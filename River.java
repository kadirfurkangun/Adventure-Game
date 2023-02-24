package creature;

public class River extends battleLoc {

	public River(Character character, Obstacle obstacle) {
		super(character, "Göl", obstacle);
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
			this.getCharacter().getInventory().setWine(true);
			System.out.println(" Şarap :)");
			return true;
		}
		System.out.println("Malesef");
			return false;
	}

}
