package exercicios_For;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double divisao = n1 / n2;
			
			if (n2 != 0) {
				System.out.println(divisao);
			} else {
				System.err.println("divisão impossivel");
			}
		}
		
		
		sc.close();

	}

}
