import java.util.*;
public class Exercicio_3_Matriz {
public static void main (String [] args) {
	Random leia = new Random ();
	int lin, col, i = 0;
	int m[][]  = new int [5][5];
	for(lin = 0; lin<5; lin++) {
		for(col=0; col<5; col++) {
			m[lin][col] = leia.nextInt(10);
		
		}
	}
	
	for(lin = 0; lin<5; lin++) {
		for(col=0; col<5; col++) {
			
			
			if(lin == i && col == i ) {
				System.out.print("["+m[lin][col]+"]");
				i++;
			}else {
				m[lin][col] = 0;
				System.out.print("["+m[lin][col]+"]");
			}if(col == 4) {
				System.out.println("\n");
			}
			
		}
	}
}
}


