package exercicios_For;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			int divisao = n % i;
			if (divisao == 0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		sc.close();

	}

}
