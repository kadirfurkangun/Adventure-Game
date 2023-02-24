package creature;

public class safeHouse extends NormalLoc{

	public safeHouse(Character character) {
		super(character,"Güvenli Ev");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLocation(Character character) {
		super.onLocation(character);
		System.out.println("Burada Karakterinizin Canı Yenilenir");
		character.setHealth(character.getHealths());
	}
	

}
