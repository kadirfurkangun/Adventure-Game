package creature;

public abstract class Character {
	private String name;
	private int id;
	private int damage;
	private int health;
	private int money;
	private İnventory inventory;
	public static int healths = 0;
	private armour armour=new armour(null, 0, 0, 0);
	private weapon weapon=new weapon(null, 0, 0, 0);
	public Character(String name,int id, int damage, int health, int money) {
		super();
		this.name=name;
		this.id = id;
		this.damage = damage;
		this.health = health;
		this.money = money;
		this.healths=health;
	}
	
	
	public İnventory getInventory() {
		return inventory;
		
	}


	public void setInventory(İnventory inventory) {
		this.inventory = inventory;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamage() {
		return damage+weapon.getDamage();
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health+armour.getProtection();// şimdi zırhı buraya eklersem 1 kere kullanmalık olur yani dövüş 
		// boyunca zırh 1 kere hasarı engeller böyle olsun 
		// diğer alternatifse dövüşün içinde zırhı kullanmak ama yaratıklar o zaman hiç
		// vuramaz
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}


	public armour getArmour() {
		return armour;
	}


	public void setArmour(armour armour) {
		this.armour = armour;
	}


	public weapon getWeapon() {
		return weapon;
	}


	public void setWeapon(weapon weapon) {
		this.weapon = weapon;
	}


	public int getHealths() {
		return healths;
	}
	
	

}
