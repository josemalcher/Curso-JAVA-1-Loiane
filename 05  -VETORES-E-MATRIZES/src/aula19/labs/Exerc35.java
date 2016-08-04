package aula19.labs;

import java.util.Scanner;

public class Exerc35 {
	/*
	 * 35. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	 * imprima cada elemento do vetor A e a relação de todos os divisores do
	 * respectivo elemento.
	 */
	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int[] vetorA = new int[10];
		 * 
		 * for (int i = 0; i < vetorA.length; i++) {
		 * 
		 * System.out.println("Entre com o valor da posição A - " + i);
		 * vetorA[i] = scan.nextInt(); }
		 * 
		 * for (int i = 0; i < vetorA.length; i++) {
		 * 
		 * System.out.println("Analizando o número " + vetorA[i]);
		 * 
		 * for (int j = 1; j < vetorA[i]; j++) { if (vetorA[i] % j == 0) {
		 * System.out.println(j + " é divisor"); } }
		 * 
		 * System.out.println(); }
		 */

		int n = 10;
		int a[] = new int[n], i, divisor;

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 50) + 1;
		}

		System.out.printf("i- a[i]   divisores de a[i]\n");
		System.out.printf("===========================================\n");
		for (i = 0; i < n; i++) {
			System.out.printf("%d- %4d   ", i, a[i]);

			for (divisor = 1; divisor <= a[i]; divisor++) {
				if ((a[i] % divisor) == 0)
					if (divisor == a[i])
						System.out.printf("%d.", divisor);
					else
						System.out.printf("%d, ", divisor);
			}

			System.out.printf("\n");
		}
		System.out.printf("===========================================\n");

	}
}
