package cursoJava;

import java.util.Scanner;

public class Exercicio3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;

		System.out.println("digite um numero");
		x = sc.nextDouble();
		System.out.println("digite um numero");
		y = sc.nextDouble();

		while (!(x == 0 || y == 0)) {
			if (x > 0 && y > 0) {
				System.out.println("quadrante 1");
				System.out.println("digite um numero");
				x = sc.nextDouble();
				System.out.println("digite um numero");
				y = sc.nextDouble();
			} else if (x < 0 && y > 0) {
				System.out.println("quadrante 2");
				System.out.println("digite um numero");
				x = sc.nextDouble();
				System.out.println("digite um numero");
				y = sc.nextDouble();
			} else if (x < 0 && y < 0) {
				System.out.println("quadrante 3");
				System.out.println("digite um numero");
				x = sc.nextDouble();
				System.out.println("digite um numero");
				y = sc.nextDouble();
			} else if (x > 0 && y < 0) {
				System.out.println("quadrante 4");
				System.out.println("digite um numero");
				x = sc.nextDouble();
				System.out.println("digite um numero");
				y = sc.nextDouble();			}
		}
		
		

		sc.close();

	}

}
