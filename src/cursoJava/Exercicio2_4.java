package cursoJava;

import java.util.Scanner;

public class Exercicio2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o horario de inicio do jogo");
		Double horaInicial = sc.nextDouble();
		System.out.println("Digite o horario de termino no jogo");
		Double horaFinal = sc.nextDouble();
		Double tempoDeJogo1 = horaFinal - horaInicial;
		Double tempoDeJogo2 = (24 - horaInicial) + horaFinal;
		
		System.out.println("Digite o dia de inicio");
		int diaDeInicio = sc.nextInt();
		System.out.println("Digite o dia de termino");
		int diaDeTermino = sc.nextInt();
		
		if ( (diaDeTermino - diaDeInicio == 0)  && (tempoDeJogo1 > 1 && tempoDeJogo1 <= 24)) {
			System.out.printf("O tempo de jogo foi %.2f%n", tempoDeJogo1);
		} else {
			if ( (diaDeTermino - diaDeInicio == 1) && (tempoDeJogo2 > 1 && tempoDeJogo2 <= 24)) {
				System.out.printf("O tempo de jogo foi %.2f%n", tempoDeJogo2);
			} else {
				System.out.println("tempo limite de jogo ecedido!");
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
