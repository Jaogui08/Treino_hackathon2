package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int somaGols = 0;
		System.out.print("Informe a quantia de gols realizados nas seguintes partidas:\n");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Gols da " + i + "° partida: ");
			int gols = scanner.nextInt();
			somaGols = somaGols + gols;
		}
		
		int mediaGols = somaGols / 5;
		
		System.out.println("\nA média de gols por partida é de: " + mediaGols + (" gols"));
		
		scanner.close();
	}

}
