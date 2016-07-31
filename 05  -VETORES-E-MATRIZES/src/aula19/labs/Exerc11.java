package aula19.labs;

import java.util.Scanner;

public class Exerc11 {
	/*
	 * 11. Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que defina e escreva a quantidade de elementos armazenados neste vetor
	 * que são pares.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length; i++){
			System.out.println("digite vetor A -> "+ i);
			vetorA[i] = leitor.nextInt();
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.print(vetorA[i] + " ");
		}
		
		int totalPares =0;
		for(int i = 0 ; i < vetorA.length ; i++){
			if(vetorA[i] % 2 == 0){
				totalPares++;
			}
		}
		System.out.println();
		System.out.println("*****************");
		System.out.println("Total de Pares = " + totalPares);
		
		
	}
}
