import java.util.*;
public class Exercicio_1 {
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double n;
		int m;
		System.out.println("Informe quanto foi investido");
		n = leia.nextDouble();
		System.out.println("Quantos meses o dinheiro ficou na conta");
		m = leia.nextInt();
		System.out.println("No final voc� ter� "+Soma(n,m)+ " reais");
		
	}
	public static double Soma(double n, int m) {
		int i;
		double soma,r;
		soma = n;
		for(i=1;i<=m; i++) {
			r = (soma*1)/100;
			soma = soma+r;
		}
		
		
		return soma;
				
	}
	
}
