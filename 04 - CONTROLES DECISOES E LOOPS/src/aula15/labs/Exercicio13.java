package aula15.labs;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		/*
		 * 13. Fa�a um Programa que leia um n�mero e exiba o dia correspondente
		 * da semana. (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve
		 * aparecer valor inv�lido.
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um numero da semana");

		int numeroDaSemana = leitor.nextInt();

		switch (numeroDaSemana) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Ter�a");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sabado");
			break;

		default:
			System.out.println("Dia da semana Inv�lido");
			break;
		}
	}
}
