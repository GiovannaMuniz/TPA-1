import java.util.*;
public class Exercicio_13_0101_Par_ou_Impar {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int b[] = new int [10];
	int i;
	
	for(i = 0; i<10; i++) {
		System.out.println("Insira o numero da "+(i+1)+" posi��o");
		a[i] = leia.nextInt();
		if( a[i]%2 == 0) {
			b[i] = 1;
		}else {
			b[i] = 0;
		}
	}
	System.out.print("B[ ");
	for(i = 0; i<10; i++) {
		System.out.printf(" %d",b[i]);
	}
	System.out.printf(" ]"); 
}
}
