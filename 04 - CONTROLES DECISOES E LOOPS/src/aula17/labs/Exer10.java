package aula17.labs;

import java.util.Scanner;

public class Exer10 {
	/*
	 * Faça um programa que receba dois números inteiros e gere os números
	 * inteiros que estão no intervalo compreendido por eles.
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro");
		int numero1 = leitor.nextInt();

		System.out.println("Digite o segundo numero inteiro");
		int numero2 = leitor.nextInt();

		if (numero1 < numero2) {
			for (int i = (numero1 + 1) ; i < numero2; i++) {
				System.out.println(i);
			}
		} else if (numero1 > numero2) {
			for (int i = (numero2 + 1); i < numero1; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Número são iguais!!!");
		}
		
	}

}
