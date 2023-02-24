 package creature;

public abstract class NormalLoc extends Location {
	public NormalLoc(Character character,String name) {
		super(character,name);
	}
	@Override
	public void onLocation(Character character) {
		System.out.println(getName()+" e Hoşgeldiniz");
	}

	

}
