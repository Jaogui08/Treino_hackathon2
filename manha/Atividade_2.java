package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double somaAltura = 0;
		System.out.print("Informe as alturas de cada jogador abaixo em metros:\n");

		for (int i = 1; i <= 10; i++) {
			System.out.print("Altura do " + i + "° jogador: ");
			double altura = scanner.nextDouble();
			somaAltura = somaAltura + altura;
		}

		double mediaAltura = somaAltura / 10;

		System.out.println(" ");
		System.out.printf("A média da altura da equipe é de: %.2f", mediaAltura);

		scanner.close();
	}

}
