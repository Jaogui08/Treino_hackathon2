package hackathon_treino2.random;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo_rodadas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Bem-vindo ao Jokenpo em java!");
		
		System.out.print("Informe a quantia de rodadas do jogo: ");
		int rodadas = scanner.nextInt();
		
		if (rodadas <= 0) {
			System.out.println("\nErro, não existe rodadas negativas ou zeradas! programa encerrado.");
			scanner.close();
			return;
		}
		
		int pontosUsuario = 0;
		int pontosMaquina = 0;
		int rodadasJogadas = 1;
		
		while (rodadasJogadas <= rodadas) {
			System.out.print("\nHora da sua jogada, 1 - Pedra, 2 - Papel, 3 - Tesoura: ");
			int jogada = scanner.nextInt();
			int jogadaMaquina = random.nextInt(1, 3);
			
			if (jogada <=0 || jogada > 3) {
				System.out.println("\nErro, jogada inválida, ponto para a máquina como penalidade");
			}
			
			if (jogada == 1 && jogadaMaquina == 3 || 
					jogada == 2 && jogadaMaquina == 1 || 
					jogada == 3 && jogadaMaquina == 2) {
				System.out.println("Parabéns, você ganhou essa rodada");
				pontosUsuario++;
			} else {
				System.out.println("A máquina ganhou essa rodada");
				pontosMaquina++;
			}
			
			rodadasJogadas++;
		}
		
		System.out.println("\n=== Jogo finalizado! ===");
		System.out.println("Pontos do usuário: " + pontosUsuario);
		System.out.println("Pontos da máquina: " + pontosMaquina);
		
		if (pontosUsuario > pontosMaquina) {
			System.out.println("\nParabéns, você ganhou o jogo!");
		} else if (pontosUsuario < pontosMaquina) {
			System.out.println("\nA máquina levou a melhor nesse jogo!");
		} else {
			System.out.println("\nEmpate! ninguém levou a melhor de ninguém");
		}
		
		scanner.close();
	}

}
