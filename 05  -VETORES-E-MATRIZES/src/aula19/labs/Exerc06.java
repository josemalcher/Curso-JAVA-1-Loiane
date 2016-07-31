package aula19.labs;

import java.util.Scanner;

public class Exerc06 {
	/*
	 * 6. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
	 * um vetor C, onde cada elemento de C � a soma dos respectivos elementos em
	 * A e B, ou seja: C[i] = A[i] + B[i].
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for (int i = 1 ; i < vetorA.length ; i++){
			System.out.println("Digite o valor: "+ i);
			
			vetorA[i] = leitor.nextInt();
			
			vetorB[i] = vetorA[i];
			
			vetorC[i] = vetorB[i] + vetorA[i];
			
		}
		
		System.out.println("Resultado:");
		System.out.print("VetorA = ");
		for(int vetor : vetorA){
			System.out.print(vetor+ " ");
		}
		System.out.println();
		System.out.print("VetorB = ");
		for(int vetor : vetorB){
			System.out.print(vetor+ " ");
		}
		System.out.println();
		System.out.print("VetorC = ");
		for(int vetor : vetorC){
			System.out.print(vetor+ " ");
		}
		System.out.println();
	}
}
