package creature;

import java.util.Random;
import java.util.Scanner;

public abstract class battleLoc extends Location {
	private Obstacle obcstacle;
	private Random rand=new Random();
	private Scanner scan=new Scanner(System.in);
	public battleLoc(Character character, String name,Obstacle obstacle) {
		super(character, name);
		this.obcstacle=obstacle;
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void onLocation(Character character) throws InterruptedException {
		// TODO Auto-generated method stub
		super.onLocation(character);
	}
	// bu ovverride edileceği ve herşeye location üzerinden erişeceğim ve override edilen kullanılacağı içni
	// buraya obstacle bazlı bir sistem yapalim ve aşşağıda bu obstacle yi vampire eşitleriz
	public boolean combat() throws InterruptedException {
		int obstacleFinalHealth=obcstacle.getHealth();
		int obstacleNumber=rand.nextInt(2)+1;
		System.out.println(getName()+"da karşınıza "+obstacleNumber+" adet "+obcstacle.getName()+" oluştu ");
		while(obstacleNumber>=0) {
			System.out.println("Lütfen ne yapacağınızı seçiniz "
					+ "\n1Savaş\n2Kaç");
			int chose=scan.nextInt();
			System.out.println("---------------------------------------------------");
			if(chose==1) {
				System.out.println("Vurmayı seçtiniz ");
				int enemeyTempHealth=obcstacle.getHealth()-this.getCharacter().getDamage();
				obcstacle.setHealth(enemeyTempHealth);
				if(obcstacle.getHealth()<=0) {
					System.out.println("Bir "+obcstacle.getName()+" YENDİNİZ!");
					int characterNewMoney=obcstacle.getMoney()+this.getCharacter().getMoney();
					this.getCharacter().setMoney(characterNewMoney);
					System.out.println("Karakterinizin yeni Altını : "+getCharacter().getMoney());
					obstacleNumber--;
					System.out.println("Geri kalan : "+obstacleNumber+" "+obcstacle.getName());
					if(obstacleNumber==0) {
						System.out.println("Tebrikler "+this.getName()+" Temizlediniz : ");
						return true;
					}
					obcstacle.setHealth(obstacleFinalHealth);
					
				}
				System.out.println("Kalan canı : "+obcstacle.getHealth());
				int heroTempHealth=this.getCharacter().getHealth()-obcstacle.getDamage();
				this.getCharacter().setHealth(heroTempHealth);
				System.out.println(this.getCharacter().getName()+" Kalan canı :"+this.getCharacter().getHealth());
				if(this.getCharacter().getHealth()<=0) {
					System.out.println("Karakteriniz ağır yara aldı Kaçılıyor");
					Thread.sleep(3000);
					return false;
					
				}
				
			
				
			}
			else if(chose==2) {
				System.out.println("Kaçmayı seçtiniz");
				return false;
			}
			else  
				System.out.println("Lütfen geçerli değer giriniz");
					continue;
			
			
			
		}
		System.out.println("yah aksi problem çıktı");
		return false;
		
		
	}
	
	

}
