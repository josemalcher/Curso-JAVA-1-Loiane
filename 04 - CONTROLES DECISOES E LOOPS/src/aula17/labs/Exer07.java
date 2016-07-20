package aula17.labs;

import java.util.Scanner;

public class Exer07 {
	/*
	 * Faça um programa que leia 5 números e informe o maior número. solucao
	 * Loiane
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 5 numeros");

		int numero;
		int maior = Integer.MIN_VALUE;
		//System.out.println("**** -> "+maior);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o Número");
			numero = leitor.nextInt();
			
			if(numero > maior){
				maior = numero;
				System.out.println("O numero maior é: "+ maior);
			}
		}
		System.out.println("O maior numeor é "+maior);

	}
}
