package aula19.labs;

import java.util.Scanner;

public class Exerc12 {
	/*
	 * 12. Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que defina e escreva a soma de todos os elementos armazenados neste
	 * vetor.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite Vetor A - "+ i);
			vetorA[i] = leitor.nextInt();
		}
		
		int soma = 0;
		
		for(int i =0 ; i < vetorA.length ; i++){
			soma += vetorA[i];
		}
		System.out.println();
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		
		System.out.println("SOma de todos os números: "+soma);
		
	}
}
