package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaPeso = 0;
		System.out.println("Informe o peso levantado em cada tentativa:");
		
		for (int i=1; i<=6; i++) {
			System.out.print("Peso da " + i + "° tentativa: ");
			int peso = scanner.nextInt();
			somaPeso = somaPeso + peso;
		}
		
		System.out.println("\nVocê levantou no total " + somaPeso + " kg");
		
		scanner.close();

	}

}
