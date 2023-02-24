package creature;

public abstract class Location {
	private Character character;
	private String name;
 	
	public Location(Character character, String name) {
		this.character = character;
		this.name = name;
	}
	public void onLocation(Character character) throws InterruptedException {}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getCharacter() {
		return character;
	}
	public void setCharacter(Character character) {
		this.character = character;
	}
	
	

}
