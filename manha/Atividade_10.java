package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaArremessos = 0;
		System.out.println("Informe a quantia de arremessos realizados em cada partida:");
		
		for (int i=1; i<=10; i++) {
			System.out.print("Arremessos da " + i + "° partida: ");
			int arremessos = scanner.nextInt();
			somaArremessos = somaArremessos + arremessos;
		}
		
		System.out.println("\nFoi feito um total de " + somaArremessos + " arremessos");
		
		scanner.close();

	}

}
