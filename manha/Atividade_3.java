package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tempo dos atletas em minutos:");

		int somaTempo = 0;
		for (int i = 1; i <= 8; i++) {
			System.out.print("Tempo do " + i + "° atleta: ");
			int tempo = scanner.nextInt();
			somaTempo = somaTempo + tempo;
		}

		System.out.println("\nO tempo total gasto na prova foi de: " + somaTempo + " minutos");

		scanner.close();
	}

}
