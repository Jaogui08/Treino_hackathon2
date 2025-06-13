package hackathon_treino2.tarde;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] pontos = new int[5];

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe os pontos marcados na " + (i + 1) + "° partida: ");
			pontos[i] = scanner.nextInt();
		}

		int soma = 0;
		for (int i = 0; i <= 4; i++) {
			soma = soma + pontos[i];
		}

		System.out.println("\nA soma dos pontos foi de " + soma);

		scanner.close();
	}

}
