package aula17.labs;

import java.util.Scanner;

public class Exer08 {
	/*
	 * 8 - Faça um programa que leia 5 números e informe a soma e a média dos
	 * números.
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite 5 numeros!");
		int numero;
		int soma = 0;
		double media = 0;
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o número");
			numero = leitor.nextInt();
			soma += numero;
		}
		media = soma/5;
		
		System.out.println("A soma é "+ soma);
		System.out.println("A médiaé "+media);
	}
}
