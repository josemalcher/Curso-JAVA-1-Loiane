package aula19.labs;

import java.util.Scanner;

public class Exerc31 {
	/*
	 * 31. Ler um vetor A com 20 elementos. Separar os elementos pares e ímpares
	 * de A utilizando apenas um vetor extra B. Sugestão: no início do vetor B
	 * armazene os elementos pares de A e nas posições restantes do vetor B
	 * armazene os elementos de A que são ímpares.
	 */
	public static void main(String[] args) {
		/*
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[20];
		int[] vetorB = new int[vetorA.length]; // pares e impares

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = scan.nextInt();
		}

		int posB = 0;

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 == 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}

		for (int i = 0; i < vetorA.length; i++) {

			if (vetorA[i] % 2 != 0) {
				vetorB[posB] = vetorA[i];
				posB++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < posB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		*/

		int n = 20;
		int a[] = new int[n];
		int b[] = new int[n];
		int i;

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 100);
		}

		int j = 0; // posicoes iniciais do vetor "b"
		int k = (n - 1); // posicoes finais do vetor "b"
		for (i = 0; i < n; i++) {
			if ((a[i] % 2) == 0) {
				b[j] = a[i];
				j++;
			} else {
				b[k] = a[i];
				k--;
			}
		}

		System.out.printf("Os valores pares e impares do vetor 'a' estao separados no vetor 'b'.\n\n");
		for (i = 0; i < n; i++) {
			System.out.printf("a[%2d] = %2d   b[%2d] = %2d\n", i, a[i], i, b[i]);
		}

		System.out.printf("\n");
		
	}
}
