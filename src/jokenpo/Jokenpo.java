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
		int numeroPartidas;
		int ganhosUsuario = 0, ganhosPc = 0, empates = 0;

		System.out.println("* * J O K E N P O * *");
		System.out.println("-----------------------");
		System.out.println("    Melhor de três");
		System.out.println("-----------------------");
		System.out.println();
		System.out.print("Quantas partidas deseja jogar? ");
		numeroPartidas = scanner.nextInt();
		System.out.println("-----------------------");

		if (numeroPartidas >= 3 && numeroPartidas % 2 == 1) {

			while (contador < numeroPartidas) {
				
				contador++;

				System.out.println("Partida " + contador);
				System.out.println();
				System.out.println("Escolha entre: \n1 - Pedra \n2 - Papel \n3 - Tesoura");
				System.out.println("-----------------------");
				System.out.print("Você escolheu a opção ");
				escolhaUsuario = scanner.nextInt();

				if (escolhaUsuario == 1) {
					System.out.println("Você escolheu pedra");
				} else if (escolhaUsuario == 2) {
					System.out.println("Você escolheu papel");
				} else {
					System.out.println("Você escolheu tesoura");
				}

				if (escolhaComputador == 1) {
					System.out.println("O computador escolheu pedra");
				} else if (escolhaComputador == 2) {
					System.out.println("O computador escolheu papel");
				} else {
					System.out.println("O computador escolheu tesoura");
				}

				System.out.println();

				if (escolhaUsuario > 3) {
					System.out.println("Não é possível obter um resultado, você não fez uma escolha válida");
				}

				if (escolhaUsuario == 1 && escolhaComputador == 3 || escolhaUsuario == 2 && escolhaComputador == 1
						|| escolhaUsuario == 3 && escolhaComputador == 2) {
					System.out.println("Você G A N H O U esta!");
					System.out.println("-----------------------");
					ganhosUsuario++;
					System.out.println("Seu placar: " + ganhosUsuario);
					System.out.println("Placar do computador: " + ganhosPc);
					System.out.println("Empatou: " + empates);
					System.out.println("-----------------------");

				} else if (escolhaUsuario == 3 && escolhaComputador == 1
						|| escolhaUsuario == 1 && escolhaComputador == 2
						|| escolhaUsuario == 2 && escolhaComputador == 3) {
					System.out.println("Computador G A N H O U esta!");
					System.out.println("-----------------------");
					ganhosPc++;
					System.out.println("Seu placar: " + ganhosUsuario);
					System.out.println("Placar do computador: " + ganhosPc);
					System.out.println("Empatou: " + empates);
					System.out.println("-----------------------");

				} else {
					System.out.println("E M P A T E");
					System.out.println("-----------------------");
					empates++;
					System.out.println("Seu placar: " + ganhosUsuario);
					System.out.println("Placar do computador: " + ganhosPc);
					System.out.println("Empatou: " + empates);
					System.out.println("-----------------------");

					
				}

			}

			if (ganhosUsuario > ganhosPc) {
				System.out.println("* * VOCÊ VENCEU O DESAFIO! * *");
			} else if (ganhosPc > ganhosUsuario) {
				System.out.println("COMPUTADOR GANHOU O DESAFIO!");
			} else {
				System.out.println("Deu empate!");

			}

			scanner.close();

		} else {
			System.out.println(
					"Número de partidas precisa atender aos seguintes atributos:\nSer maior ou igual a três;\nSer ímpar.");

		}

	}

}
