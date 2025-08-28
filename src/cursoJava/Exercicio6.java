package cursoJava;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Double a, b, c;


		System.out.println("Digite o valor de (A) ");
		a = sc.nextDouble();
		System.out.println("Digite o valor de (B) ");
		b = sc.nextDouble();
		System.out.println("Digite o valor de (C) ");
		c = sc.nextDouble();
		
		Double areaDoTrianguloRetangulo = (a * c) / 2;

		Double areaDoCirculo = Math.PI * Math.pow(c, 2);

		Double areaDoTrapezio = ((a + b) * c) / 2;

		Double areaDoQuadrado = b * b;

		Double areaDoRetangulo = a * b;


		System.out.printf(
				"A area do triangulo retangulo é %.2f%nA area do circulo é %.2f%nA area do trapezio é %.2f%nA area do quadrado é %.2f%nA area do retangulo é %.2f%n",
				areaDoTrianguloRetangulo, areaDoCirculo, areaDoTrapezio, areaDoQuadrado, areaDoRetangulo);

		sc.close();

	}

}
