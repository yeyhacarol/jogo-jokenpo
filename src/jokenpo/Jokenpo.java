package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Random sorteio = new Random();

		int escolhaUsuario;
		int escolhaComputador = sorteio.nextInt(3) + 1;
		int contador = 0;

		System.out.println("* * J O K E N P O * *");
		System.out.println("-----------------------");
		System.out.println("Melhor de três partidas");
		System.out.println("-----------------------");
		System.out.println();

		while (contador <= 2) {
			contador++;

			System.out.println("Partida " + contador);
			System.out.println();
			System.out.println("Escolha entre: \n1 - Pedra \n2 - Papel \n3 - Tesoura");
			System.out.println("-----------------------");
			System.out.print("Você escolheu a opção ");
			escolhaUsuario = scanner.nextInt();

			System.out.println();
			System.out.println("O computador escolheu a opção " + escolhaComputador);
			System.out.println();

			if (escolhaUsuario == 1 && escolhaComputador == 3 || escolhaUsuario == 2 && escolhaComputador == 1
					|| escolhaUsuario == 3 && escolhaComputador == 2) {
				System.out.println("Você G A N H O U esta!");
				System.out.println("-----------------------");

			} else if (escolhaUsuario == 3 && escolhaComputador == 1 || escolhaUsuario == 1 && escolhaComputador == 2
					|| escolhaUsuario == 2 && escolhaComputador == 3) {
				System.out.println("Computador G A N H O U esta!");
				System.out.println("-----------------------");

			} else if (escolhaUsuario > 3) {
				System.out.print("Não é possível obter um resultado, você não fez uma escolha válida");
				
			} else {
				System.out.println("E M P A T E");
				System.out.println("-----------------------");

			}

		}

		scanner.close();
		
	}

}
