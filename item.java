package creature;

public abstract class item {
	private String name;
	private int id;
	private int money;
	public item(String name, int id, int money) {
		super();
		this.name = name;
		this.id = id;
		
		this.money = money;
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
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	

}
