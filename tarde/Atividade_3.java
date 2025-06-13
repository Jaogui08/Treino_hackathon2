package hackathon_treino2.tarde;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> distancias = new ArrayList<Double>();

		for (int i = 0; i <= 3; i++) {
			System.out.print("Informe a distância em metros do " + (i + 1) + "° corredor: ");
			double distanciaRecebida = scanner.nextDouble();
			distancias.add(distanciaRecebida);
		}

		double soma = 0;
		for (int i = 0; i <= 3; i++) {
			soma = soma + distancias.get(i);
		}

		System.out.println("\nFoi percorrido um total de " + soma + " m");

		scanner.close();
	}

}
