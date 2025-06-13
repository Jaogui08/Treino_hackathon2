package hackathon_treino2.random;

import java.util.Random;
import java.util.Scanner;

public class RPG {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		System.out.println("Bem-vindo ao RPG em java!");

		System.out.print("Cuidado, monstro avistado à frente! deseja batalhar com ele? (sim/não): ");
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
		int playerAttack;
		int monsterAttack;
		System.out.println("\nVocê entrou em batalha com o monstro, cuidado com os ataques\n");

		while (playerHp > 0 || monsterHp > 0) {
			if (playerUlt == 3) {
				System.out.println("Sua ult está carregada!");
				System.out.print("Sua rodada, 1 - Ataque básico, 2 - Ataque pesado, 3 - Defesa, 4 - Ultimate: ");
				playerAttack = scanner.nextInt();
				if (playerAttack > 4) {
					System.out.println("Ataque inválido, -5 hp como penalidade");
					playerHp = playerHp - 5;
				}
			} else {
				System.out.print("Sua rodada, 1 - Ataque básico, 2 - Ataque pesado, 3 - Defesa: ");
				playerAttack = scanner.nextInt();

				if (playerAttack <= 0 || playerAttack > 3) {
					System.out.println("Ataque inválido, -5 hp como penalidade");
					playerHp = playerHp - 5;
				}
			}

			if (monsterUlt == 6) {
				monsterAttack = random.nextInt(1, 4);
			} else {
				monsterAttack = random.nextInt(1, 3);
			}
			
			if (monsterAttack == 2) {
				monsterUlt++;
			}
			
			if (playerAttack == 2) {
				playerUlt++;
				if (playerUlt > 3) {
					playerUlt = playerUlt - 1;
				}
			}

			if (playerAttack == 1 && monsterAttack == 3 || playerAttack == 2 && monsterAttack == 3) {
				System.out.println("Seu ataque foi defendido pelo monstro!");
			} else if (playerAttack == 1 && monsterAttack == 1 || playerAttack == 1 && monsterAttack == 2 || playerAttack == 1 && monsterAttack == 4) {
				System.out.println("Seu ataque surgiu efeito no monstro!");
				monsterHp = monsterHp - 25;
			} else if (playerAttack == 2 && monsterAttack == 2 || playerAttack == 2 && monsterAttack == 1 || playerAttack == 1 && monsterAttack == 4) {
				System.out.println("Seu ataque pesado surgiu efeito no monstro!");
				monsterHp = monsterHp - 40;
			} else if (playerAttack == 4 && monsterAttack == 1 || playerAttack == 4 && monsterAttack == 2 || playerAttack == 4 && monsterAttack == 3 || playerAttack == 4 && monsterAttack == 4) {
				System.out.println("Sua ultimate surgiu um dano massivo no monstro!");
				monsterHp = monsterHp - 90;
				playerUlt = playerUlt - playerUlt;
			}
			
			if (monsterAttack == 1 && playerAttack == 3 || monsterAttack == 2 && playerAttack == 3) {
				System.out.println("Você defendeu o ataque do monstro!");
			} else if (monsterAttack == 1 && playerAttack == 1 || monsterAttack == 1 && playerAttack == 2 || monsterAttack == 1 && playerAttack == 4) {
				System.out.println("Você sofreu um ataque do monstro!");
				playerHp = playerHp - 20;
			} else if (monsterAttack == 2 && playerAttack == 1 || monsterAttack == 2 && playerAttack == 2 || monsterAttack == 2 && playerAttack == 4) {
				System.out.println("Você sofreu um ataque pesado do monstro!");
				playerHp = playerHp - 35;
			} else if (monsterAttack == 4 && playerAttack == 1 || monsterAttack == 4 && playerAttack == 2 || monsterAttack == 4 && playerAttack == 3 || monsterAttack == 4 && playerAttack == 4) {
				System.out.println("Você sofreu um dano massivo da ultimate do monstro!");
				playerHp = playerHp - 65;
				monsterUlt = monsterUlt - monsterUlt;
			}
			
		}

	}

}
