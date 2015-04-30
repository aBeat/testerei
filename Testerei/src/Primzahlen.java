import java.util.Scanner;


public class Primzahlen {
	
	static int l�ngenAbfrage(){
		Scanner s = new Scanner(System.in);
		int l�nge = s.nextInt();
		s.close();
		
		return l�nge;
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
		int l�nge = l�ngenAbfrage();
	
		System.out.println("Alles klar!");
		
		int[] ergebnisArray = new int[l�nge];
		
		for(int i = 0; i<ergebnisArray.length ; i++){
			if(istPrimzahl(l�nge) == true)
				System.out.println(i);
		}
	}

}
