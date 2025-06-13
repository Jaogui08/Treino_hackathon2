package hackathon_treino2.tarde;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> pontos = new ArrayList<Integer>();

		for (int i = 0; i <= 5; i++) {
			System.out.print("Informe os pontos do " + (i + 1) + "° jogo: ");
			int pontosRecebidos = scanner.nextInt();
			pontos.add(pontosRecebidos);
		}

		int soma = 0;
		for (int i = 0; i <= 5; i++) {
			soma = soma + pontos.get(i);
		}

		System.out.println("\nFoi marcado um total de " + soma + " pontos");

		scanner.close();
	}

}
