package aula17.labs;

import java.util.Scanner;

public class Exer14 {
	/*
	 * 14 - Fa�a um programa que pe�a 10 n�meros inteiros, calcule e mostre a
	 * quantidade de n�meros pares e a quantidade de n�meros impares.
	 */
	// solu��o LOIANE

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int numero;
		int pares = 0;
		int impares = 0;

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um nunero inteiro");
			numero = leitor.nextInt();

			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}

		}
		System.out.println("Pares "+pares);
		System.out.println("Impares "+impares);

	}

}
