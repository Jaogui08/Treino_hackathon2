package hackathon_treino2.tarde;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> acertos = new ArrayList<Integer>();

		for (int i = 0; i <= 6; i++) {
			System.out.print("Informe a quantia de acertos do " + (i + 1) + "° atleta: ");
			int acertosRecebidos = scanner.nextInt();
			acertos.add(acertosRecebidos);
		}

		int soma = 0;
		for (int i = 0; i <= 6; i++) {
			soma = soma + acertos.get(i);
		}

		int media = soma / acertos.size();

		System.out.println(" ");
		System.out.printf("A média dos acertos é " + media);

		scanner.close();

	}

}
