import java.util.Scanner;
public class Exercicio_2_Metodo_Tabuada {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int num;
	System.out.println("Seu numero:");
	num = leia.nextInt();
	tabuada(num);
}


public static void tabuada(int a) {
	int i, r;
	for (i = 0; i<=10; i++) {
		r = a*i;
		System.out.println(a+"x"+i+"="+r);
		
	}
}
}
