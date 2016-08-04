package aula19.labs;

import java.util.Scanner;

public class Exerc34 {
	/*
	 * 34. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	 * imprima cada elemento do vetor A e a relação de todos os pares de 0 até o
	 * respectivo elemento.
	 */
	public static void main(String[] args) {
/*
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = scan.nextInt();
		}

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Analizando o número " + vetorA[i]);

			for (int j = 2; j < vetorA[i]; j++) {
				if (j % 2 == 0) {
					System.out.println(j + " é par");
				}
			}

			System.out.println();
		}
*/
		int n = 10;
		int i, j, a[] = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 20);
		}

		for (i = 0; i < n; i++) {
			// inicio - cabecalho, mostra a[i] e o inicio da relacao
			System.out.printf("a[%d] = %2d {", i, a[i]);

			// meio - corpo, mostra a relacao dos pares de 0 ate a[i]
			for (j = 0; j <= a[i]; j = j + 2) { // passo 2 para mostrar os pares
												// de 0 ate a[i]
				if (j == 0)
					System.out.printf("%d", j);
				else
					System.out.printf(", %d", j);
			}

			// fim - rodape, fecha a i-esima relacao
			System.out.printf("}\n");
		}
	}
}
