package aula19.labs;

import java.util.Scanner;

public class Exerc32 {
	/*
	 * 32. Criar um vetor A com 5 elementos inteiros. Escreva um programa que
	 * imprima a tabuada de cada um dos elementos do vetor A.
	 */

	public static void main(String[] args) {
/*
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Tabuada de " + vetorA[i]);

			for (int j = 1; j <= 10; j++) {

				System.out.println(j + " * " + vetorA[i] + " = " + (vetorA[i] * j));
			}

			System.out.println();
		}
		*/
		//Resolução :  Prof. Omero Francisco Bertol, M.Sc.
		int n = 5;
		int a[] = new int[n], i, j;

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 15);
		}

		for (i = 0; i < n; i++) {
			// inicio - cabecalho da i-esima tabuada
			System.out.printf("%da. tabuada de %d\n", (i + 1), n);
			System.out.printf("----------------\n");

			// meio (ou corpo) - tabuada do i-esimo elemento do vetor "a"
			for (j = 1; j <= 10; j++) {
				System.out.printf("%d X %2d = %d\n", a[i], j, (a[i] * j));
			}

			// fim - rodape
			System.out.printf("----------------\n\n");
		}
	}
}
