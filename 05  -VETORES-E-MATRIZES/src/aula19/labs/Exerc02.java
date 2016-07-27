package aula19.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		/*
		 * 2. Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
		 * mesmo tipo e tamanho e com os elementos do vetor A multiplicados por
		 * 2, ou seja: B[i] = A[i] * 2.
		 */
		
		Scanner leitor = new Scanner(System.in);
		
		int[] VetorA = new int[8];
		int[] VetorB = new int[VetorA.length];
		
		for(int i = 0 ; i < VetorA.length ; i++){
			System.out.println("Digite 8 inteiros");
			VetorA[i] = leitor.nextInt();
			
			VetorB[i] = VetorA[i] * 2;
		}
		System.out.print("Vetor A -> ");
		for(int vetor : VetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B -> ");
		for(int vetor : VetorB){
			System.out.print(vetor + " ");
		}
		
		

	}

}
