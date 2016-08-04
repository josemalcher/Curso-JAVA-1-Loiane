package aula19.labs;

import java.util.Scanner;

public class Exerc33 {
	/*
	 * 33. Criar um vetor A com 10 elementos inteiros. Escreva um programa que
	 * imprima cada elemento do vetor A e uma mensagem indicando se o respectivo
	 * elemento é um número primo ou não.
	 */
	public static void main(String[] args) {
/*
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];

		for (int i = 0; i < vetorA.length; i++) {

			System.out.println("Entre com o valor da posição A - " + i);
			vetorA[i] = scan.nextInt();
		}

		boolean primo;
		String msg;

		for (int i = 0; i < vetorA.length; i++) {

			primo = true;
			for (int j = 2; j < vetorA[i]; j++) {
				if (vetorA[i] % j == 0) {
					primo = false;
					break;
				}
			}

			msg = "";
			if (primo) {
				msg = " primo";
			} else {
				msg = " não é primo";
			}

			System.out.println(vetorA[i] + msg);
		}
		*/
		// resolução: Prof. Omero Francisco Bertol, M.Sc.
		int n = 10;
		int i, divisor, ctdivisores, a[] = new int[n];

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 100);
		}

		for (i = 0; i < n; i++) {
			// inicio - zera o contador de divisores
			ctdivisores = 0;

			// meio - conta os divisores de a[i]
			for (divisor = 1; divisor <= a[i]; divisor++) {
				if ((a[i] % divisor) == 0)
					ctdivisores = ctdivisores + 1;
			}

			// fim - verifica se a[i] eh um nro primo
			if (ctdivisores == 2)
				System.out.printf("a[%d] = %2d <--- nro primo\n", i, a[i]);
			else
				System.out.printf("a[%d] = %2d\n", i, a[i]);
		}
		
	}
}
