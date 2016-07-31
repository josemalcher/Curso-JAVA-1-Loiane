package aula19.labs;

import java.util.Scanner;

public class Exerc09 {
	/*
	 * 9. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
	 * um vetor C, onde cada elemento de C é a divisão dos respectivos elementos
	 * em A e B, ou seja: C[i] = A[i] / float(B[i]).
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(" Digite o Vetor A = " + i);
			vetorA[i] = leitor.nextInt();
		}
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(" Digite o Vetor B = " + i);
			vetorB[i] = leitor.nextInt();
		}
		for (int i = 0; i < vetorA.length; i++) {

			vetorC[i] = vetorA[i] / vetorB[i];
		}

		System.out.println();

		System.out.println("Resultado = ");

		System.out.print("Vetor A = ");
		for (int vetor : vetorA) {
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int vetor : vetorB) {
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor C = ");
		for (double vetor : vetorC) {
			System.out.print(vetor + " ");
		}

	}
}
