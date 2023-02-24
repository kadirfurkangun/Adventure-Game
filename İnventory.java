package creature;

public class İnventory {
	private boolean water;
	private boolean bread;
	private boolean wine;
	
	public İnventory() {
		super();
		this.water = false;
		this.bread = false;
		this.wine = false;
	}
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	public boolean isBread() {
		return bread;
	}
	public void setBread(boolean bread) {
		this.bread = bread;
	}
	public boolean isWine() {
		return wine;
	}
	public void setWine(boolean wine) {
		this.wine = wine;
	}
	
	

}
