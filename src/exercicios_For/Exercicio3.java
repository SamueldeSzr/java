package exercicios_For;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite um numero de casos de testes");
		int x = sc.nextInt();
		
		
		
		for (int i = 0; i < x; i++) {
			double n1, n2, n3;
			System.out.println("digite um numero");
			n1 = sc.nextDouble();
			System.out.println("digite um numero");
			n2 = sc.nextDouble();
			System.out.println("digite um numero");
			n3 = sc.nextDouble();
			
			double mediaPonderada = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			System.out.printf("%.1f%n", mediaPonderada);
			
		}
		
		
		
		sc.close();

	}

}
