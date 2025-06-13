package hackathon_treino2.manha;

import java.util.Scanner;

public class Atividade_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int somaCartoes = 0;
		System.out.println("Informe a quantia de cartões vermelhos recebidos nas partidas:");
		
		for (int i=1; i<=7; i++) {
			System.out.print("Cartões da " + i + "° partida: ");
			int cartoes = scanner.nextInt();
			somaCartoes = somaCartoes + cartoes;
		}
		
		System.out.println("\nFoi recebido um total de " + somaCartoes + " cartões vermelhos");
		
		scanner.close();

	}

}
