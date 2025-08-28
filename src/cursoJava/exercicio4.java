package cursoJava;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o seu numero");
		int numeroDoFuncionario= sc.nextInt();
		System.out.println("Digite quantas horas você trabalhou esse mes");
		Double horasTrabalhadas = sc.nextDouble();
		System.out.println("Digite quanto vale a sua hora");
		Double valorHora = sc.nextDouble();
		
		Double salario = valorHora * horasTrabalhadas;
		
		System.out.printf("O seu numero é %d %n"
				+ "O seu salario é %.2f", numeroDoFuncionario, salario);
		
		
		
		sc.close();
	}

}
