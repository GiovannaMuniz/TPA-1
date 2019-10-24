import java.util.*;
public class Exercicio_4_Matriz_Diagonal {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int i, j, lin, col;
	int m[][] = new int [5][5];
	
	for(lin = 0; lin<5; lin++) {
		for(col=0; col<5; col++) {
			m[lin][col] = 0;
			
		}
	}

	for(int linp=0, cold = 4; linp<=4 && cold>=0;linp++, cold-- ) {
		System.out.println(linp+""+cold);
		m[linp][cold] = 1;
	}
	
	for(lin = 0; lin<5; lin++) {
		for(col=0; col<5; col++) {
			System.out.print("["+m[lin][col]+"]");
			if(col == 4) {
				System.out.println("\n");
			}
			
		}
	}
	
}
}