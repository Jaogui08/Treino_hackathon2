package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaPontos = 0;
		System.out.println("Informe a quantia de pontos marcados em suas partidas:");
		
		for (int i=1; i<=6; i++) {
			System.out.print("Pontos da " + i + "° partida: ");
			int pontos = scanner.nextInt();
			somaPontos = somaPontos + pontos;
		}
		
		System.out.println("\nVocê marcou no total " + somaPontos + " pontos");
		
		scanner.close();
	}

}
