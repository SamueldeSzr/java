package exercicios_For;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double quadrado, cubo;
		
		
		for (int i = 1; i <= n; i++) {
			quadrado = Math.pow(i, 2);
			cubo = Math.pow(i, 3);
			System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		sc.close();
		
	}

}
