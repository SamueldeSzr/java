package exercicios_For;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x;
		int in = 0;
		int out = 0;

		for (x = 0; x < n; x++) {
			System.out.println("digite um numero");
			int num = sc.nextInt();

			if (num >= 10 && num <= 20) {
				in++;
			} else {
				out++;
			}

		}

		System.out.printf("%d in %n" + "%d out", in, out);

		sc.close();

	}

}
