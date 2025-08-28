package cursoJava;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Digite o numero de peças");
		Double numeroDePecas1 = sc.nextDouble();
		System.out.println("Digite o valor da peça1");
		Double valorDaPeca1 = sc.nextDouble();
		//--------------------------------------------
		
		System.out.println("Digite o numero de peças");
		Double numeroDePecas2 = sc.nextDouble();
		System.out.println("Digite o valor da peça2");
		Double valorDaPeca2 = sc.nextDouble();
		
		Double valoraSerPago = (numeroDePecas1 * valorDaPeca1) + (numeroDePecas2 * valorDaPeca2);
		
		System.out.printf("O valor a ser pago é: %.2f", valoraSerPago);
		
		
		sc.close();

	}

}
