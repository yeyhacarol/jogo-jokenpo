package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner usuario = new Scanner(System.in);
		Random sorteio = new Random();
		
		int escolhausuario;
		int numsorteado = sorteio.nextInt(3) + 1;
		
		System.out.println("*** J O K E N P O ***");
		System.out.println("                       ");
		System.out.println("Escolha entre: ");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("                       ");
		System.out.print("Você escolheu: ");
		escolhausuario = usuario.nextInt(); 
		
		usuario.close();
		
		System.out.println("O computador escolheu: " + numsorteado);
		
		if (escolhausuario == 1 && numsorteado == 3 || escolhausuario == 2 && numsorteado == 1 || escolhausuario == 3 && numsorteado == 2) {
			System.out.print("Você GANHOU :) ");
		}else if (escolhausuario == 3 && numsorteado == 1 || escolhausuario == 1 && numsorteado == 2 || escolhausuario == 2 && numsorteado == 3) {
			System.out.print("Computador ganhou :(");
		}else if (escolhausuario > 3) {
			System.out.print("Não é possível obter um resultado, você não fez uma escolha válida");
		}else {
			System.out.print("Empate");
		}
		
	}

}
