package cursoJava;

import java.util.Scanner;

public class Exercicio2_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codigo;
		double valor;
		
		System.out.printf("CODIGO        |ESPECIFICAÇÃO         |PREÇO     %n"
				+ "1             |CACHORRO QUENTE       |4,00      %n"
				+ "2             |X-SALADA              |4,50      %n"
				+ "3             |X-BACON               |5,00      %n"
				+ "4             |TORRADA               |2,00      %n"
				+ "5             |REFRIGERANTE          |1,50      %n"
				);
		System.out.println("Digite o codigo do produto");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade");		
		double quantidade = sc.nextDouble();

		if (codigo == 1) {
			double preco = 4;
			valor = quantidade * preco;
			System.out.printf("O valor da sua compra ficou %.2f%n", valor);

		} else {
			if (codigo == 2) {
				double preco = 4.5;
				valor = quantidade * preco;
				System.out.printf("O valor da sua compra ficou %.2f%n", valor);

			} else {
				if (codigo == 3) {
					double preco = 5;
					valor = quantidade * preco;
					System.out.printf("O valor da sua compra ficou %.2f%n", valor);

				} else {
					if (codigo == 4) {
						double preco = 2;
						valor = quantidade * preco;
						System.out.printf("O valor da sua compra ficou %.2f%n", valor);

					} else {
						if (codigo == 5) {
							double preco = 1.5;
							valor = quantidade * preco;
							System.out.printf("O valor da sua compra ficou %.2f%n", valor);

						} else {
							System.err.println("Código inexistente!!!");
						}
					}
				}
			}
		}

		sc.close();

	}

}
