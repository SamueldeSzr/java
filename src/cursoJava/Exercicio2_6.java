package cursoJava;

import java.util.Scanner;

public class Exercicio2_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero");
		double x = sc.nextDouble();

		if (x < 0) {
			System.err.println("fora de intervalo");
		} else {
			if (x >= 0 && x <= 25) {
				System.out.println("o intervalo em que o numero se encontra é [0, 25]");
			} else {
				if (x > 25 && x <= 50) {
					System.out.println("o intervalo em que o numero se encontra é [25,50]");
				} else {
					if (x > 50 && x <= 75) {
						System.out.println("o intervalo em que o numero se encontra é [50,75]");
					} else {
						if (x > 75 && x <= 100) {
							System.out.println("o intervalo se enconta entre [77,100]");
						} else {
							System.err.println("fora de intervalo");
						}
					}
				}
			}
		}

		sc.close();
	}

}
