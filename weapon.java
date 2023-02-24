package creature;

public  class weapon extends item {
	private int damage;

	public weapon(String name, int id, int money,int damage) {
		super(name, id, money);
		this.damage=damage;
		// TODO Auto-generated constructor stub
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	

}
