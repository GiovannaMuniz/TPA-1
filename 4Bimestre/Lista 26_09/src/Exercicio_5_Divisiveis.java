import java.util.*;
public class Exercicio_5_Divisiveis {
public static void main (String [] args) {
	Scanner leia = new Scanner (System.in);
	int a[] = new int [10];
	int i, t, r;
	for(i=0; i<10; i++) {
		System.out.println("Coloque o numero");
		a[i] = leia.nextInt();
		
		System.out.printf("%d = {",a[i]);
		for(t =1; t<=a[i]; t++) {
			r = a[i]%t;
		
		if(r == 0) {
			System.out.printf("%d ",t);
		}
	
		
		}
		System.out.printf("}\n");
}
		
}
}