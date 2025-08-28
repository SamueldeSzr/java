package cursoJava;

import java.util.Scanner;

public class Exercicio3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2002) {
			System.err.println("senha incorreta!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido");
		
		
		
		
		
		
		
		sc.close();

	}

}
