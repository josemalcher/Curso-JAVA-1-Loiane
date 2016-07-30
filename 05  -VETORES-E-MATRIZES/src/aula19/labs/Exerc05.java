package aula19.labs;

import java.util.Scanner;

public class Exerc05 {
	/*
	 * 5. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
	 * mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá ser o
	 * respectivo elemento de A multiplicado por sua posição (ou índice), ou
	 * seja: B[i] = A[i] * i.
	 */
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 1; i < vetorA.length; i++){
			System.out.println("Digite o " + i);
			vetorA[i] = leitor.nextInt();
			
			vetorB[i] = vetorA[i]*i;
					
		}
		
		System.out.println();
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		
		System.out.println();
		
		for(int vetor : vetorB){
			System.out.print(vetor + " ");
		}
	}
}
