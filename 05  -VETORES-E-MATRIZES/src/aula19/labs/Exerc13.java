package aula19.labs;

import java.util.Scanner;

public class Exerc13 {
	/*
	 * 13. Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que determine a soma dos elementos armazenados neste vetor que são
	 * múltiplos de 5.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite Vetor A - "+i);
			vetorA[i] = leitor.nextInt();
		}
		
		int soma = 0;
		for(int i = 0 ; i < vetorA.length ; i++){
			if(vetorA[i] % 5 == 0){
				soma += vetorA[i];
			}
		}
		
		
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.println(vetor + " ");
		}
		
		System.out.println("A soma dos multiplos de 5 é "+soma);
		
	}
}
