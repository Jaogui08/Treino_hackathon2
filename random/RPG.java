package hackathon_treino2.random;

import java.util.Random;
import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Bem-vindo ao RPG em java!");
		
		System.out.println("Cuidado, monstro avistado à frente! deseja batalhar com ele? (sim/não): ");
		String escolha = scanner.next();
		
		if (!escolha.equalsIgnoreCase("sim")) {
			System.out.println("RPG encerrado..");
			scanner.close();
			return;
		}
		
		int playerHp = 200;
		int monsterHp = 350;
		int playerUlt = 0;
		int monsterUlt = 0;
		System.out.println("\nVocê entrou em batalha com o monstro, cuidado com os ataques\n");
		
		while (playerHp > 0 || monsterHp > 0) {
			System.out.print("Sua rodada, 1 - Ataque básico, 2 - Ataque pesado, 3 - Defesa");
			int playerAttack = scanner.nextInt();
			
			if (playerAttack <= 0 || playerAttack > 3) {
				System.out.println("Ataque inválido, -5 hp como penalidade");
			} else if (playerAttack == 2) {
				playerUlt++;
			}
			
			int monsterAttack = random.nextInt(1, 3);
			
			if (monsterAttack == 2) {
				monsterUlt++;
			}
			
			if (playerAttack == 1 && monsterAttack == 3 || playerAttack == 2 && monsterAttack == 3) {
				System.out.println("Seu ataque foi defendido pelo monstro!");
			} else if (playerAttack == 1 && monsterAttack == 2 || playerAttack == 1 && monsterAttack == 1) {
				System.out.println("Seu ataque surgiu efeito no monstro!");
				monsterHp = monsterHp - 25;
			} else if (playerAttack == 2 && monsterAttack == 2 || playerAttack == 2 && monsterAttack == 1) {
				System.out.println("Seu ataque pesado surgiu efeito no monstro!");
				monsterHp = monsterHp - 40;
			} else if ()
		}

	}

}
