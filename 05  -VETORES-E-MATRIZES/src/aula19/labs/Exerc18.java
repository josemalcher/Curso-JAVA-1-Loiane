package aula19.labs;

import java.util.Scanner;

public class Exerc18 {
	/*
	 * 18. Ler um vetor A com 10 elementos inteiros correspondentes as idades de
	 * um grupo de pessoas. Escreva um programa que determine e escreva a menor
	 * e a maior idades e suas respectivas posições.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorIdades = new int[10];
		
		for (int i = 0 ; i < vetorIdades.length ; i++){
			System.out.println("Digite as idades = "+ i);
			vetorIdades[i] = leitor.nextInt();
		}
		
		int menor = vetorIdades[0];
		int indexMenor = 0;
		
		int maior = vetorIdades[0];
		int indexMaior = 0;
		
		for(int i = 1 ; i < vetorIdades.length ; i++){
			if(vetorIdades[i] > maior){
				maior = vetorIdades[i];
				indexMaior = i;
			}else if(vetorIdades[i] < menor){
				menor = vetorIdades[i];
				indexMenor = i;
			}
		}
		System.out.print("Vetor idades = ");
		for(int i = 0 ; i< vetorIdades.length ; i++){
			System.out.print(vetorIdades[i] + " ");
		}
		System.out.println();
		
		System.out.println("Menor idade = "+ menor);
		System.out.println("Indice menor idade = "+ indexMenor);
		System.out.println("Maior idade = "+ maior);
		System.out.println("Indice maior = "+ indexMaior);
		
		
	}
}
