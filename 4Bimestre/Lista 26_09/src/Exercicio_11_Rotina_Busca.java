import java.util.*;
public class Exercicio_11_Rotina_Busca {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int[10];
	int i, n, r = 0;
	for (i = 0; i<10; i++) {
		System.out.println("Informe o numero que ser� colocado na "+(i+1)+" posi��o");
		a[i] = leia.nextInt();
	}
	System.out.println("NUMEROS COLOCADOS");
	System.out.println("Coloque o numero que quer pesquisar");
	n = leia.nextInt();
	for (i=0;i<10; i++) {
		if(n==a[i]) {
			r++;
			System.out.println("Seu numero est� na "+(i+1)+" posi��o");
		}
	}
	if(r==0) {
		System.out.println("Infelizmente seu numero n�o est� no vetor");
	}
}
}
