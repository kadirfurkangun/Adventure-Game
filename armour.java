package creature;

public  class armour extends item {
	private int protection;

	public armour(String name, int id, int money,int protection) {
		super(name, id, money);
		this.protection=protection;
		// TODO Auto-generated constructor stub
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	

}
