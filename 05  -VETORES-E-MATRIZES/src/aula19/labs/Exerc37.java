package aula19.labs;

import java.util.Scanner;

public class Exerc37 {
	/*
	 * 37. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
	 * mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial do
	 * elemento correspondente em A.
	 */
	public static void main(String[] args) {
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * int[] vetorA = new int[15]; int[] vetorB = new int[vetorA.length];
		 * 
		 * for (int i = 0; i < vetorA.length; i++) {
		 * 
		 * System.out.println("Entre com o valor da posição A - " + i);
		 * vetorA[i] = scan.nextInt(); }
		 * 
		 * for (int i = 0; i < vetorA.length; i++) {
		 * 
		 * vetorB[i] = 1; // opcional for (int j = 1; j <= vetorA[i]; j++) {
		 * vetorB[i] *= j; } }
		 * 
		 * System.out.print("Vetor A = "); for (int i = 0; i < vetorA.length;
		 * i++) { System.out.print(vetorA[i] + " "); } System.out.println();
		 * 
		 * System.out.print("Vetor B = "); for (int i = 0; i < vetorA.length;
		 * i++) { System.out.print(vetorB[i] + " "); } System.out.println();
		 */

		// Resolução de Prof. Omero Francisco Bertol, M.Sc.

		int n = 15;
		int a[] = new int[n];
		long b[] = new long[n];
		int i, j;
		long f;

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 16);
		}

		for (i = 0; i < n; i++) {
			f = 1;
			for (j = 1; j <= a[i]; j++) {
				f = f * j;
			}
			b[i] = f;

			System.out.printf("a[%2d] = %2d! = %d\n", i, a[i], b[i]);
		}

	}
}
