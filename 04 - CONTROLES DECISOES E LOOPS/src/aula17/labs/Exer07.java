package aula17.labs;

import java.util.Scanner;

public class Exer07 {
	/*
	 * Fa�a um programa que leia 5 n�meros e informe o maior n�mero. solucao
	 * Loiane
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite 5 numeros");

		int numero;
		int maior = Integer.MIN_VALUE;
		//System.out.println("**** -> "+maior);
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o N�mero");
			numero = leitor.nextInt();
			
			if(numero > maior){
				maior = numero;
				System.out.println("O numero maior �: "+ maior);
			}
		}
		System.out.println("O maior numeor � "+maior);

	}
}
