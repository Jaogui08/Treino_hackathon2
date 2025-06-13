package hackathon_treino2.tarde;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> alturas = new ArrayList<Double>();

		for (int i = 0; i <= 4; i++) {
			System.out.print("Informe a altura em metros do " + (i + 1) + "° jogador: ");
			double alturaRecebida = scanner.nextDouble();
			alturas.add(alturaRecebida);
		}

		double soma = 0;
		for (int i = 0; i <= 4; i++) {
			soma = soma + alturas.get(i);
		}

		double media = soma / alturas.size();

		System.out.println(" ");
		System.out.printf("A média das alturas é %.2f", media);

		scanner.close();
	}

}
