
public class Bike {
	
	private static String kennzeichen;
	private static int anzahl;
	private static double tankinhalt;
	private static double tankf�llung;
	
	public static void setKennzeichen(String pKennzeichen){
		kennzeichen = pKennzeichen;
	}

	public static void setAnzahl(int pAnzahl){
		anzahl = pAnzahl;
	}
	
	public static void setTankinhalt(double pTankinhalt ){
		tankinhalt = pTankinhalt;
	}
	
	public static void setTankf�llung(double pTankf�llung){
		tankf�llung = pTankf�llung;
	}
	
	
	public static String getKennzeichen(){
		return kennzeichen;
	}
	
	public static int getAnzahl(){
		return anzahl;
	}

	public static double getTankinhalt(){
		return tankinhalt;
	}
	
	public static double getTankf�llung(){
		return tankf�llung;
	}
	
	public static void tanken(double pTankinhalt){
		if (pTankinhalt < 0)
		{}
		else
		{
		tankinhalt = tankinhalt + pTankinhalt;
		}
	}
	
	public static void main(String[] args){
		
		Bike YamahaR1;
		YamahaR1 = new Bike();
			
		System.out.println("Hallo! Ich zeige dir Kennzeichen und anderen Mist!");
		
		YamahaR1.setKennzeichen("BB JU DE");
		YamahaR1.setAnzahl(17);
		YamahaR1.setTankinhalt(12.2);
		YamahaR1.setTankf�llung(13.66);
		
		System.out.println("Guten Tag!");	
		System.out.println();
		System.out.println("Ihr neues Motorrad hat die folgenden Daten:");
		System.out.println("Ihr Kennzeichen lautet " + YamahaR1.getKennzeichen());
		System.out.println("Die Anzahl ihres Motorrades ist " + YamahaR1.getAnzahl() + " ... krass!");
		System.out.println("Und ihr massiver Tank fasst unglaubliche " + YamahaR1.getTankinhalt() + " Liter");
		System.out.println("Wir tanken f�r Sie noch " + YamahaR1.getTankf�llung() + " Liter! Wir sind nett!");
		YamahaR1.tanken(tankf�llung);
		System.out.println("Ihr aufgef�llter Tank fasst nun " + YamahaR1.getTankinhalt() + " ...einfach nice!!");
		System.out.println();
		System.out.println("Viel Spa�!");
	}
}
