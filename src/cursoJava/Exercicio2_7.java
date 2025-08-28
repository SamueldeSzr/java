package cursoJava;

import java.util.Scanner;

public class Exercicio2_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else {
			if ( x == 0 && y != 0 ) {
				System.out.println("eixo y");
			} else {
				if ( x != 0 && y == 0 ) {
					System.out.println("eixo x");
				} else {
					if (x > 0 && y > 0 ) {
						System.out.println("Quadrante1");
					} else {
						if (x < 0 && y > 0 ) {
							System.out.println("Quadrante2");
						} else {
							if (x < 0 && y < 0 ) {
								System.out.println("Quadrante3");
							} else {
								if (x > 0 && y < 0 ) {
									System.out.println("Quadrante4");
								}
							}
						}
					}
				}
			}
		}

		sc.close();

	}

}
