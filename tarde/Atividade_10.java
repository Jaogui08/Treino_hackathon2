package hackathon_treino2.tarde;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] defesas = new int[8];

		for (int i = 0; i <= 7; i++) {
			System.out.print("Informe as defesas realizadas no " + (i + 1) + "° jogo: ");
			defesas[i] = scanner.nextInt();
		}

		int soma = 0;
		for (int i = 0; i <= 7; i++) {
			soma = soma + defesas[i];
		}

		System.out.println("\nO total de defesas foi: " + soma);

		scanner.close();

	}

}
