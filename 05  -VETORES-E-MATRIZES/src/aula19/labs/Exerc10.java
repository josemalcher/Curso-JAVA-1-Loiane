package aula19.labs;

import java.util.Scanner;

public class Exerc10 {
	/*
	 * 10. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
	 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o
	 * resto da divisão do respectivo elemento de A por 2 (dois), ou seja: B[i]
	 * := A[i] % 2.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite Vetor A "+i);
			vetorA[i] = leitor.nextInt();
		}
		
		for(int i = 0 ; i < vetorA.length ; i++){
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.println("**************");
		System.out.println("RESULTADO: ");
		
		System.out.print("Vetor A = ");
		for (int vetor : vetorA) {
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for (int vetor : vetorB) {
			System.out.print(vetor + " ");
		}
		
	}
}
