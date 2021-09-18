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
		int ganhosUsuario = 0, ganhosPc = 0, empates = 0, valorVitoria = 0;
		String jogarNovamente = "Sim";

		System.out.println("* * J O K E N P O * *");
		System.out.println("-----------------------");
		System.out.println("   Melhor de três");
		System.out.println("-----------------------");

		while (jogarNovamente.equalsIgnoreCase("Sim") || jogarNovamente.equalsIgnoreCase("S")) {

			System.out.print("Quantas partidas deseja jogar? ");
			numeroPartidas = scanner.nextInt();
			System.out.println("-----------------------");

			while (numeroPartidas < 3 && numeroPartidas % 2 != 1) {
				System.out.println(
						"Número de partidas precisa atender aos seguintes atributos:\nSer maior ou igual a três;\nSer ímpar."
								+ " Insira um número válido: ");
				numeroPartidas = scanner.nextInt();
			}

			valorVitoria = (numeroPartidas / 2) + (numeroPartidas % 2);
			System.out.println();
			System.out.println("O VALOR DA VITÓRIA É: " + valorVitoria);
			System.out.println();
			System.out.println("-----------------------");

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
					System.out.println("Empates: " + empates);
					System.out.println("-----------------------");

				}

				if (ganhosUsuario == valorVitoria) {
					System.out.println("* * VOCÊ VENCEU O DESAFIO * *");
					System.out.println("-----------------------");
				} else if (ganhosPc == valorVitoria) {
					System.out.println("* * COMPUTADOR VENCEU O DESAFIO * *");
					System.out.println("-----------------------");
				}else if (contador == numeroPartidas) {
					numeroPartidas++;
				}

			}

			System.out.println("Deseja jogar novamente? (S/N)");
			jogarNovamente = scanner.next();

			numeroPartidas = 0;
			contador = 0;
			ganhosUsuario = 0;
			ganhosPc = 0;
			empates = 0;
			valorVitoria = 0;

		}

		scanner.close();

		System.out.println("FIM DO JOGO!\nObrigada por jogar!");

	}

}
