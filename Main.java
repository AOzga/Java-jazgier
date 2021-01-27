package kontenery;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
	
	public static Kontener hehe(int ilewazysz,String comaszwsrodku) {
		Random rand = new Random();
		
		Kontener dej = null;
		
		switch(rand.nextInt(7)) {
		case 0:
			Kontener x1 = new Kontener(ilewazysz,comaszwsrodku);
			dej = x1;
			break;
		case 1:
			Kontener x2 = new Container40ft(ilewazysz,comaszwsrodku);
			dej = x2;
			break;
		case 2:
			Kontener x3 = new Container20ftHC(ilewazysz,comaszwsrodku);
			dej = x3;
			break;
		case 3:
			Kontener x4 = new Container40ftHC(ilewazysz,comaszwsrodku);
			dej = x4;
			break;
		case 4:
			Kontener x5 = new Reefer(ilewazysz,comaszwsrodku);
			dej = x5;
			break;
		case 5:
			Kontener x6 = new Tanker(ilewazysz,comaszwsrodku);
			dej = x6;
			break;
		case 6:
			Kontener x7 = new openTop(ilewazysz,comaszwsrodku);
			dej = x7;
			break;
		case 7:
			Kontener x8 = new flatRack(ilewazysz,comaszwsrodku);
			dej = x8;
			break;
		default:
			break;
		}
		return dej;
	}

	public static void main(String[] args) {
		Random rand = new Random();
		List<Kontener> kontenery = new ArrayList<>();
		String[] kontent = {"dupy","jaja","chuje","luki awalonskie","lusterka","truskawki","jablka","polaki"};
		
		for(int i=0;i<150;i++) {
			kontenery.add(hehe(rand.nextInt(500),kontent[rand.nextInt(kontent.length)]));
		}
		
		
		for (String x: kontent) {
	        System.out.println(x);
	    }
		
		for (Kontener k: kontenery) {
	        System.out.print(k.GetInfo());
	    }
	}

}
