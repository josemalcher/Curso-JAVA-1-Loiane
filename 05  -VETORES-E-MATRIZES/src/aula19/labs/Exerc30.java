package aula19.labs;

import java.util.Scanner;

public class Exerc30 {
	/*
	 * 30. Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
	 * que nos vetor B e C serão armazenados o valores pares e ímpares de A,
	 * respectivamente.
	 */
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);
		
		int vetorA[] = new int[20];
		int vetorB[] = new int[vetorA.length];
		int vetorC[] = new int[vetorA.length];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Entre com o valo rda posição A - " + i);
			vetorA[i] = leitor.nextInt();
		}
		
		int posicaoB = 0;
		int posicaoC = 0;
		
		for(int i= 0 ; i < vetorA.length ; i++){
			if(vetorA[i] % 2 == 0 ){
				vetorB[posicaoB] = vetorA[i];
				posicaoB++;
			}else{
				vetorC[posicaoC] = vetorA[i];
				posicaoC++;
			}
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < posicaoB; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < posicaoC; i++) {
			System.out.print(vetorC[i] + " ");
		}

		System.out.println();
		*/
		//Resolução de Prof. Omero Francisco Bertol, M.Sc.

		int n = 20;
		int a[] = new int[n];
		int b[] = new int[n];
		int c[] = new int[n];
		int i, j, k;

		for (i = 0; i < n; i++) {
			a[i] = (int) Math.round(Math.random() * 100);
		}

		j = 0; // indice do vetor "b" - pares do vetor "a"
		k = 0; // indice do vetor "c" - impares do vetor "b"
		for (i = 0; i < n; i++) {
			if ((a[i] % 2) == 0) { // verifica se o i-esimo elemento do vetor
									// "a" eh par
				b[j] = a[i];
				j = j + 1;
			} else {
				c[k] = a[i];
				k = k + 1;
			}
		}

		System.out.printf("Vetor 'a'__________________________________________________\n");
		for (i = 0; i < n; i++) {
			System.out.printf("%2d ", a[i]);
		}

		System.out.printf("\n\nVetor 'b' (os elementos pares do vetor 'a')________________\n");
		for (i = 0; i < j; i++) {
			System.out.printf("%2d ", b[i]);
		}

		System.out.printf("\n\nVetor 'c' (os elementos impares do vetor 'a')______________\n");
		for (i = 0; i < k; i++) {
			System.out.printf("%2d ", c[i]);
		}

		System.out.printf("\n");
	}

	}

