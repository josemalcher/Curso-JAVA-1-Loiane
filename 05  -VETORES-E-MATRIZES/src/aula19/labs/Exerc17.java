package aula19.labs;

import java.util.Scanner;

public class Exerc17 {
	/*
	 * 17. Ler um vetor A com 10 elementos inteiros correspondentes as idades de
	 * um grupo de pessoas. Escreva um programa que determine e escreva a
	 * quantidade de pessoas que possuem idade superior a 35 anos.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite as idades Pessoa nª: "+ i);
			vetorA[i] = leitor.nextInt();
		}
		
		int pessoas35 = 0;
		for(int i = 0 ; i< vetorA.length ; i++){
			if(vetorA[i] > 35){
				pessoas35++;
			}
		}
		
		System.out.print("Vetor A de idades = ");
		for(int idade : vetorA){
			System.out.print(idade +" ");
		}
		System.out.println();
		System.out.println("Pessoas com idade acida de 35 = "+ pessoas35);
	}
}
