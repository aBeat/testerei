import java.util.Scanner;


public class Primzahlen {
	
	static int längenAbfrage(){
		Scanner s = new Scanner(System.in);
		int länge = s.nextInt();
		s.close();
		
		return länge;
	}
	
    public static boolean istPrimzahl(final long value) {
        if (value <= 2) {
            return (value == 2);
        }
        for (long i = 2; i * i <= value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
	
	public static void main (String args[])
	{
		System.out.println("Wie viele Primzahlen sollen ausgegeben werden?");
		int länge = längenAbfrage();
	
		System.out.println("Alles klar!");
		
		int[] ergebnisArray = new int[länge];
		
		for(int i = 0; i<ergebnisArray.length ; i++){
			if(istPrimzahl(länge) == true)
				System.out.println(i);
		}
	}

}
