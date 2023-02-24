package creature;

import java.util.Scanner;

public class Game {
	private Scanner scan=new Scanner(System.in);
	private Character character=null;
	private Location location=null;
	Obstacle obstacle=null;

	public void Start() throws InterruptedException {
		String dot="---------------------------------------------------";
		System.out.println("Macera oyununa Hoşgeldiniz Lütfen karakter seçiniz ");
		karakterleriEkranaVer();
		System.out.println(dot);
		System.out.println("Lütfen seçiminizi Yapınız :");
		switch (scan.nextInt()) {
		case 1:character=new Samurai();
			break;
		case 2:character =new Archer();
			break;
		case 3:character =new Kngiht();
			break;
		default:character=new Samurai();
			break;
		}
		System.out.println(character.getName()+"'ı seçtiniz");
		character.setInventory(new İnventory());// normalde bu daha tepedeydi 
		// şuan Karakterimizin gidebileceği bölgeleri yazıoyurz daha önce null excepter 
		// hatası gösteriyordu ama artık :) düzeltildi 
		System.out.println("Oyunu Yenmeniz için her lokasyona girmeli ve 'EKMEK-SU-ŞARAP'\ntoplamalısınız "
				+ "BOL ŞANSLAR");
		while(!((character.getInventory().isBread()==true)&&(character.getInventory().isWater()==true)&&(character.getInventory().isWine()==true))) {
			// yukarıdaki sistem  trueden farklı olduğu sürece döndür kafası ve hepsinde geçerli (veya ||)
			location=new safeHouse(character);
			System.out.println(dot);
			String locationChoseDescription="Şuan "+location.getName()+" desiniz Lütfen gideceğiniz yeri seçiniz"// güvenli evde olduğunu göstermek için getName() yaptım ama olmadı 
					+"\n1-Güvenli ev\n2-Market\n3-Orman\n4-Mağara\n5-Göl";
		
			System.out.println(locationChoseDescription);
			int chose=scan.nextInt();
			// güvenli ev ve karakterin statlarını görme
			if(chose==1) {
				location=new safeHouse(character);
			
				location.onLocation(character);
				
				System.out.println("Karakterinizin Şuanki Statları : ");
				ekranaVer(character);
				Thread.sleep(3000);
			} 
			else if(chose==2) {
				location =new Market(character);
				location.onLocation(character);
				Thread.sleep(3000);
				
			}
			else if(chose==3) {
				obstacle=new Zombi();
				location=new Forest(character, obstacle);
				location.onLocation(character);
				Thread.sleep(3000);

			}
			else if (chose==4) {
				obstacle=new vampir();
				location=new Cave(character, obstacle);
				location.onLocation(character);
				Thread.sleep(3000);

			}
			else if(chose==5) {
				obstacle=new Ayı();
				location=new River(character, obstacle);
				location.onLocation(character);
				Thread.sleep(3000);

			}
			else
				System.out.println("Lütfen geçerli değerler veriniz");
			Thread.sleep(3000);

			
			
		}
		System.out.println("Kazandınız!");
		Thread.sleep(3000);

		
		}
	
	public void karakterleriEkranaVer() {
Character character[] = {new Samurai(),new Archer(),new Kngiht()};
		
		for (Character c : character) {// Karakterlerimizi Ekrana Veriyoruz 
			System.out.print("Karakterin ismi : "+c.getName()+"|Hasarı : "+c.getDamage()+
					"|Canı : "+c.getHealth()+"|İd si :"+c.getId()+"|Başlangıç Parası : "+c.getMoney()+"\n");
		
		}

	}
	public void ekranaVer(Character  character) {
		System.out.println("Karakterin canı : "+character.getHealth()+"\nKarakterin Hasarı : "+character.getDamage()+"\nKarakterin Parası : "+character.getMoney());
		
	}
	
	
	
}