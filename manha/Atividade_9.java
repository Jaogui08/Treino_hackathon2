package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaDistancia = 0;
		System.out.println("Informe a distância percorrida durante seus dias de treino em Km:");
		
		for (int i=1; i<=7; i++) {
			System.out.print("Distância do " + i + "° dia: ");
			int distancia = scanner.nextInt();
			somaDistancia = somaDistancia + distancia;
		}
		
		System.out.println("\nVocê pedalou no total " + somaDistancia + " Km");
		
		scanner.close();

	}

}
