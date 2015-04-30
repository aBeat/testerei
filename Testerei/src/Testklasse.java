import java.util.Scanner;

public class Testklasse
{
//	Datendeklarationen
	public static int ersteZahl , zweiteZahl;
	public static int ergebnis;
	public static int[] array = new int[2];
	
//	Rechnen - Methode	
	public static int rechnen(int ersteZahl, int zweiteZahl) 
	{
		int ergebnis = 0;
		ergebnis = ersteZahl + zweiteZahl;
		
		return ergebnis;
	}
	
//	Benutzereingaben - Methode	
	public static int[] zahlenAbfrage(int[] array)
	{		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Wie lautet die erste Zahl für die krasse Rechnung?");
		array[0] = scan.nextInt();
		System.out.println("... und wie lautet die zweite Zahl?");
		array[1] = scan.nextInt();
		scan.close();
		
		return array;
	}
	
	public static void main (String args[])
	{		
		System.out.println("Heftige Mathe-Rechnung");	// println = zeile mit umbruch
		System.out.println();							// leerzeile
		
//		Benutzereingabe
		zahlenAbfrage(array);
		
//		Ausgabe	
		System.out.println();	
		System.out.println("Die Aufgabe lautet " + array[0] + "+" + array[1] + " - Oh Gott!");
		System.out.println();
		
//		Ausrechnen der beiden Zahlen		
		ergebnis = rechnen(array[0], array[1]);
		
		if (ergebnis > 10)
		{
			System.out.println("Ergebnis ist größer als 10!");
		}
		if (ergebnis > 20)
		{
			System.out.println("Ergebnis ist größer als 20!");
		}
		if (ergebnis > 30)
		{
			System.out.println("Ergebnis ist größer als 30!");
		}
		if (ergebnis > 40)
		{
			System.out.println("Ergebnis ist größer als 40!");
		}
		if (ergebnis > 50)
		{
			System.out.println("Ergebnis ist größer als 50!");
		}

//		Ausgabe	
		System.out.println();
		System.out.print("Das Ergebnis lautet: " + ergebnis);	// print = zeile ohne umbruch
	}	
}
