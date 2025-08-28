package cursoJava;

import java.util.Scanner;

public class printf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
System.out.println("digite dois numeros");
		Double x = sc.nextDouble();
		Double y = sc.nextDouble();
		
		System.out.printf("A variavel x vale %.2f e a y vale %.2f", x, y);
		sc.close();
	}

}
