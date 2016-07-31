package aula19.labs;

import java.util.Scanner;

public class Exerc08 {
	/*
	 * 8. Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
	 * um vetor C, onde cada elemento de C é a multiplicação dos respectivos
	 * elementos em A e B, ou seja: C[i] = A[i] * B[i].
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite os valores de A: "+ i);
			vetorA[i] = leitor.nextInt();
		}
		
		System.out.println();
		
		for(int i = 0 ; i < vetorB.length ; i++){
			System.out.println("Digite o valores de B: "+ i);
			vetorB[i] = leitor.nextInt();
		}
		
		for(int i = 0 ; i < vetorC.length ; i++){
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.println();
		
		System.out.println("Resultado = ");
		
		System.out.print("Vetor A = " );
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor B = " );
		for(int vetor : vetorB){
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor C = " );
		for(int vetor : vetorC){
			System.out.print(vetor + " ");
		}
		
	}
}
