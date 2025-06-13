package hackathon_treino2.tarde;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] treino = new int[7];

		for (int i = 0; i <= 6; i++) {
			System.out.print("Informe a quantia de treinos feitos no " + (i + 1) + "° dia: ");
			treino[i] = scanner.nextInt();
		}

		int soma = 0;
		for (int i = 0; i <= 6; i++) {
			soma = soma + treino[i];
		}

		System.out.println("\nA quantia de treinos foi de " + soma);

		scanner.close();

	}

}
