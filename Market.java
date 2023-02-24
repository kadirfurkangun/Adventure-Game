package creature;

import java.util.Scanner;

public class Market extends NormalLoc{
	private Scanner scan=new Scanner(System.in);		
	private item item;


	public Market(Character character) {
		super(character,"Market");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onLocation(Character character) {
		super.onLocation(character);
		menü();
		
		
	}
	public void menü() {// karakterin item seçmesi için hazırlanın menü
		System.out.println("Lütfen Katogori seçiniz ");
		String dot="---------------------------------------------------";
		System.out.println("Silah için 1\nSavunma için 2");// karakter sadece menüyü görecek
		
		switch (scan.nextInt()) {
		case 1:	weapon [] itemSaldırı= {new tabanca(),new kılıç(),new tüfek()};
		for (weapon item : itemSaldırı) {
			System.out.println(item.getName()+"\nHasarı : "+item.getDamage()+"\nÜcreti : "+item.getMoney()+
					"\nid : "+item.getId());
			System.out.println(dot);
			
		}
		buyWeapon();// silah satın alınması için seçieln sistem
			break;
		case 2:	armour [] itemSavunma= {new hafifZırh(),new ortaZırh(),new ağırZırh()};
		for (armour item : itemSavunma) {
			System.out.println(item.getName()+"\nSavunması : "+item.getProtection()+"\nÜcreti : "+item.getMoney()+
					"\nid : "+item.getId());
			System.out.println(dot);
		}
		buyArmour();
			break;

		default:System.out.println("Lütfen geçerli değer giriniz ");
			break;
		}

		
	}
	// karakterin eşya satın alması için yazılan metot
	public void buyWeapon() {
		System.out.println("Lütfen almak istediğiniz Silahın id sini giriniz :");
		System.out.println("Çıkmak için 4 e basabilirsiniz");
		while(true) {
		int chose=scan.nextInt();
		if(chose==1) {
			weapon weapon=null;
			weapon=new tabanca();
			System.out.println(weapon.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=weapon.getMoney()) {
				getCharacter().setWeapon(weapon);
				System.out.println("Karakterin yeni hasarı : "+getCharacter().getDamage());
				int tempMoney=getCharacter().getMoney()-weapon.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
		}
		else if(chose==2) {
			weapon weapon=null;
			weapon=new kılıç();
			
			System.out.println(weapon.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=weapon.getMoney()) {
				getCharacter().setWeapon(weapon);
				System.out.println("Karakterin yeni hasarı : "+getCharacter().getDamage());
				int tempMoney=getCharacter().getMoney()-weapon.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
			
		}
		else if(chose==3) {
			weapon weapon=null;
			weapon=new tüfek();
			System.out.println(weapon.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=weapon.getMoney()) {
				getCharacter().setWeapon(weapon);
				System.out.println("Karakterin yeni hasarı : "+getCharacter().getDamage());
				int tempMoney=getCharacter().getMoney()-weapon.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
		}
		else if(chose==4) {
			System.out.println("çıkılıyor ");
			break;
		}
		else System.out.println("Lütfen geçerli değer giriniz");
		// karakterin seçilen itemi karakterin  özelliklerindeki iteme eklerim 
		
	}
	}
	// ikisi için ortak metot yazacak bilgim şuanlık olmadığı için ayrı ayrı metot yazdım
	public  void buyArmour() {
		System.out.println("Lütfen almak istediğiniz Silahın id sini giriniz :");
		System.out.println("Çıkmak için 4 e basabilirsiniz");

		while(true) {
		int chose=scan.nextInt();
		if(chose==1) {
			armour armour=null;
			armour=new hafifZırh();
			System.out.println(armour.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=armour.getMoney()) {
				getCharacter().setArmour(armour);
				System.out.println("Karakterin yeni canı : "+getCharacter().getHealth());
				int tempMoney=getCharacter().getMoney()-armour.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
		}
		else if(chose==2) {
			armour armour=null;
			armour=new ortaZırh();
			System.out.println(armour.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=armour.getMoney()) {
				getCharacter().setArmour(armour);
				System.out.println("Karakterin yeni canı : "+getCharacter().getHealth());
				int tempMoney=getCharacter().getMoney()-armour.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
			
		}
		else if(chose==3) {
			armour armour=null;
			armour=new ağırZırh();
			System.out.println(armour.getName()+" almaya karar verdiniz ");
			if(getCharacter().getMoney()>=armour.getMoney()) {
				getCharacter().setArmour(armour);
				System.out.println("Karakterin yeni canı : "+getCharacter().getHealth());
				int tempMoney=getCharacter().getMoney()-armour.getMoney();
				getCharacter().setMoney(tempMoney);
				System.out.println("Karakterin yeni parası : "+getCharacter().getMoney());
			}
			else System.out.println("Paranız yetersiz");
		}
		else if(chose==4) {
			System.out.println("çıkılıyor ");
			break;
		}
		else System.out.println("Lütfen geçerli değer giriniz");
	}
	}

}
