package hackathon_treino2.tarde;

import java.util.Scanner;

public class Atividade_8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] tempo = new double[5];

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe o tempo em segundos da " + (i + 1) + "° corrida: ");
			tempo[i] = scanner.nextDouble();
		}

		double soma = 0;
		for (int i = 0; i <= 4; i++) {
			soma = soma + tempo[i];
		}

		System.out.println("\nO tempo total gasto foi de " + soma + " segundos");

		scanner.close();

	}

}
