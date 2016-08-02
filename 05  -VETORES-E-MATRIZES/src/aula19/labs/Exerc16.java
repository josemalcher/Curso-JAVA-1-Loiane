package aula19.labs;

import java.util.Scanner;

public class Exerc16 {
	/*
	 * 16. Criar um vetor A com 10 elementos inteiros. Escrever um programa que
	 * calcule e escreva: 
	 * a) a soma de elementos armazenados neste vetor que são
	 * inferiores a 15; 
	 * b) a quantidade de elementos armazenados no vetor que
	 * são iguais a 15; e 
	 * c) a média dos elementos armazenados no vetor que são
	 * superiores a 15.
	 * 
	 * SOlução Loiane
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite o vetor A - " + i);
			vetorA[i] = leitor.nextInt();
		}
		
		int somaMenor15 = 0;
		int somaMaior15 = 0;
		int qtidadeMaior15 = 0;
		int igual15 = 0;
		
		for(int i = 0 ; i < vetorA.length ; i++){
			if(vetorA[i] == 15){
				igual15++;
			}else if(vetorA[i] < 15){
				somaMenor15 += vetorA[i];
			}else{
				qtidadeMaior15++;
				somaMaior15 += vetorA[i];
			}
		}
		
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		
		System.out.println("Qtd numeors == 15:  "+ igual15);
		System.out.println("Soma números < 15: "+ somaMenor15);
		System.out.println("Media numeros > 15: " + (somaMaior15/qtidadeMaior15));
		
		
	}
}
