package hackathon_treino2.random;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.print("Informe o primeiro número: ");
			int num = scanner.nextInt();
			
			System.out.print("Informe o segundo número: ");
			int num2 = scanner.nextInt();
			
			System.out.println("\n1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.print("Escolha a operação desejada: ");
			int escolha = scanner.nextInt();
			
			switch (escolha) {
			
			case 1:
				int soma = num + num2;
				System.out.println("\nO resultado da soma foi: " + soma);
				break;
			case 2:
				int sub = num - num2;
				System.out.println("\nO resultado da subtração foi: " + sub);
				break;
			case 3:
				int mult = num * num2;
				System.out.println("\nO resultado da multiplicação foi: " + mult);
				break;
			case 4: 
				int div = num * num2;
				System.out.println("\nO resultado da divisão foi: " + div);
				break;
			default:
				System.out.println("\nOperação inválida selecionada");
				break;
			}
			
			System.out.print("Deseja fazer outra operação? (sim/não): ");
			String opc = scanner.next();
			
			if (opc.equalsIgnoreCase("sim")) {
				continue;
			} else {
				System.out.println("Encerrando programa...");
				scanner.close();
				return;
			}
		}

	}

}
