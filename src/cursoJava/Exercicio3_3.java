package cursoJava;

import java.util.Scanner;

public class Exercicio3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("| 1 | Alcool   |%n"
				+ "| 2 | Gasolina |%n"
				+ "| 3 | Disel    |%n"
				+ "| 4 | Fim      |%n");

		System.out.println("digite um codigo de 1 a 4");
		int codigo = sc.nextInt();
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;

		while (codigo != 4) {
			if (codigo == 1) {
				alcool++;
				System.out.printf("alcoool : %d%n", alcool);
				System.out.println("digite um codigo de 1 a 4");
				codigo = sc.nextInt();
			} else if (codigo == 2) {
				gasolina++;
				System.out.printf("gasolina : %d%n%n", gasolina);
				System.out.println("digite um codigo de 1 a 4");
				codigo = sc.nextInt();
			} else if (codigo == 3) {
				disel++;
				System.out.printf("disel : %d", disel);
				System.out.println("digite um codigo de 1 a 4");
				codigo = sc.nextInt();
				
			} else {
				System.err.println("digite um numero de 1 a 4");
				codigo = sc.nextInt();
			}
		}

		System.out.printf("Muito obrigado %n"
				+ "|Alcool:   %d|%n"
				+ "|Gasolina: %d|%n"
				+ "|Disel:    %d|%n", alcool, gasolina, disel);

		sc.close();
	}

}
