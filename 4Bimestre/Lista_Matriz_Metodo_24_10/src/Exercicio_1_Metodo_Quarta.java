import java.util.*;
public class Exercicio_1_Metodo_Quarta {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int n;
	n = leia.nextInt();
	quarta(n);
	
	
}

public static void quarta(int a) {
	int i = 1;
	int aux = a;
	for(i = 2; i<=4; i++) {
		aux = aux*a;
		
	}
	a = aux;
	System.out.println("Total:"+a);
	
}
}
