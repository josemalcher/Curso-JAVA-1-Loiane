package aula33.labs;

import java.util.Scanner;

public class Exerc04 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exercícios, criando todos os atributos do tipo
	 * privado, métodos getters e setters e construtores. Os métodos que serão
	 * utilizados pela classe de teste devem ser públicos. Se necessário, crie
	 * métodos privados como auxiliares para organizar melhor o código fonte
	 * também.
	 * 
	 * 4. Reescreva o exercício 6 da aula 20 (Jogo da Velha). Desenvolva uma
	 * classe para representar o Jogo da Velha. Desenvolva uma classe para
	 * testar o Jogo.
	 * 
	 * https://www.youtube.com/watch?v=cv8-GNYNOOo&feature=youtu.be
	 * 
	 * Solução da Loiane
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		JogoDaVelha jogoDaVelha = new JogoDaVelha();

		System.out.println("Jogador 1 = X");
		System.out.println("Jogador 2 = O");

		boolean ganhou = false;
		char sinal;
		int linha = 0, coluna = 0;

		while (!ganhou) {

			if (jogoDaVelha.vezJogador1()) {

				System.out.println("Vez do jogador 1. Escolha linha e coluna (1-3).");
				sinal = 'X';
			} else {

				System.out.println("Vez do jogador 2. Escolha linha e coluna (1-3).");
				sinal = 'O';
			}

			linha = valor("Linha", scan);
			coluna = valor("Coluna", scan);

			if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
				System.out.println("Posição já usada, tente novamente");
			}

			jogoDaVelha.imprimirTabuleiro();

			if (jogoDaVelha.verificarGanhador('X')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 1 ganhou!");
			} else if (jogoDaVelha.verificarGanhador('O')) {
				ganhou = true;
				System.out.println("Parabéns, jogador 2 ganhou!");
			} else if (jogoDaVelha.getJogada() > 9) {
				ganhou = true;
				System.out.println("Ninguém ganhou essa partida.");
			}
		}
	}

	static int valor(String tipoValor, Scanner scan) {
		int valor = 0;
		boolean valorValida = false;
		while (!valorValida) {
			System.out.println("Entre com a " + tipoValor + " (1, 2 ou 3)");
			valor = scan.nextInt();
			if (valor >= 1 && valor <= 3) {
				valorValida = true;
			} else {
				System.out.println("Entrada inválida, tente novamente");
			}
		}
		valor--;
		return valor;
	}

}
