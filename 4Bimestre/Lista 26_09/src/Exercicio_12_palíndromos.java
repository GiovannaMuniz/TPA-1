import java.util.*;
public class Exercicio_12_pal�ndromos {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int i, j, r= 0 ;
	for (i=0; i<10; i++) {
		System.out.println("Informe o numero que ser� colocado na "+(i+1)+" posi��o");
		a[i] = leia.nextInt();
	}
	for(i = 0, j = 9; i<10 && j>-1; i++, j--) {
		if(a[i] == a[j]) {
			r++;
		}
	}
	
	if(r>=10) {
		System.out.println("� Palindromo");
	}else {
		System.out.println("N�o � Palindromo");
	}
}
}
