import java.util.*;
public class Exercicio_7_Fatorial {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [15];
	int i, j, aux = 1, auxf =0, f;
	for (i =0; i<15; i++) {
		System.out.println("Coloque o numero");
		a[i] = leia.nextInt();
		for(j = 1; j<=a[i]; j++) {
			auxf =  aux*j;
			aux = auxf;
		}
		f = auxf;
		System.out.println("a["+(i+1)+"] = "+f);
	}
}
}
