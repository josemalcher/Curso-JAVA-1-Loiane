package aula19.labs;

import java.util.Scanner;

public class Exerc14 {
	/*
	 * 14. Criar um vetor A com 10 elementos inteiros. Implementar um programa
	 * que defina e escreva a média aritmética simples dos elementos ímpares
	 * armazenados neste vetor.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite Vetor A - "+i);
			vetorA[i] = leitor.nextInt();
		}
		

		int soma = 0;
		int impar = 0;
		double media = 0;
		for(int i = 0 ; i < vetorA.length ; i++){
			if(vetorA[i] % 2 != 0){
				soma =+ vetorA[i];
				impar++;
			}
		}
		media = soma/impar;
		
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		
		System.out.println();
		
		System.out.println("Soma = "+ soma);
		System.out.println("Numeros de impares = "+impar);
		System.out.println("Média = "+media);
		
			
	}
}
