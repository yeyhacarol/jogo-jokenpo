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
		System.out.println("Melhor de tr�s partidas");
		System.out.println("-----------------------");
		System.out.println();

		while (contador <= 2) {
			contador++;

			System.out.println("Partida " + contador);
			System.out.println();
			System.out.println("Escolha entre: \n1 - Pedra \n2 - Papel \n3 - Tesoura");
			System.out.println("-----------------------");
			System.out.print("Voc� escolheu a op��o ");
			escolhaUsuario = scanner.nextInt();

			System.out.println();
			System.out.println("O computador escolheu a op��o " + escolhaComputador);
			System.out.println();

			if (escolhaUsuario == 1 && escolhaComputador == 3 || escolhaUsuario == 2 && escolhaComputador == 1
					|| escolhaUsuario == 3 && escolhaComputador == 2) {
				System.out.println("Voc� G A N H O U esta!");
				System.out.println("-----------------------");

			} else if (escolhaUsuario == 3 && escolhaComputador == 1 || escolhaUsuario == 1 && escolhaComputador == 2
					|| escolhaUsuario == 2 && escolhaComputador == 3) {
				System.out.println("Computador G A N H O U esta!");
				System.out.println("-----------------------");

			} else if (escolhaUsuario > 3) {
				System.out.print("N�o � poss�vel obter um resultado, voc� n�o fez uma escolha v�lida");
				
			} else {
				System.out.println("E M P A T E");
				System.out.println("-----------------------");

			}

		}

		scanner.close();
		
	}

}
