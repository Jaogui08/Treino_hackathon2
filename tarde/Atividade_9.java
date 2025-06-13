package hackathon_treino2.tarde;

import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] voltas = new int[6];

		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe as voltas realizadas no " + (i + 1) + "° treino: ");
			voltas[i] = scanner.nextInt();
		}

		int soma = 0;
		for (int i = 0; i <= 5; i++) {
			soma = soma + voltas[i];
		}

		System.out.println("\nO total de voltas foi: " + soma);

		scanner.close();
	}

}
