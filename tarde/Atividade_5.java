package hackathon_treino2.tarde;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> gols = new ArrayList<Integer>();

		for (int i = 0; i <= 9; i++) {
			System.out.print("Informe os gols do " + (i + 1) + "° jogador: ");
			int pontosRecebidos = scanner.nextInt();
			gols.add(pontosRecebidos);
		}

		int soma = 0;
		for (int i = 0; i <= 9; i++) {
			soma = soma + gols.get(i);
		}

		System.out.println("\nFoi marcado um total de " + soma + " gols");

		scanner.close();

	}

}
