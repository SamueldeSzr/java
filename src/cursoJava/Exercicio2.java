package cursoJava;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio do circulo");
		double raio = sc.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		
		
		System.out.printf("A area do ciculo é igual a %.2f", area);
		
		
		sc.close();
		
	}

}
