package aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exerc28 {
	/*
	 * 28. Ler um vetor A com 10 elementos e construir um vetor B de mesmo tipo
	 * e tamanho e com os mesmos elementos de A, sendo que estes deverão estar
	 * invertidos, ou seja, o primeiro elemento de A passa a ser o último de B,
	 * o segundo elemento de A passa a ser o penúltimo de B e assim por diante.
	 */
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Entre com o valor posição: "+ i);
			vetorA[i] = leitor.nextInt();
			
			vetorB[vetorA.length - i - 1] = vetorA[i];
		}
		
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.print("Vetor B = ");
		for(int vetor : vetorB){
			System.out.print(vetor + " ");
		}
		
		*/
		
		int n = 10;
		int i, j;
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		
		for(i = 0 ; i < n ; i++){
			vetorA[i] = (int)Math.round(Math.random() * 20);
		}
		
		j = n -1 ; //ultima posição de "b"
		
		for(i = 0 ; i < n ; i++){
			vetorB[j] = vetorA[i];
			j = j - 1; // penultima, antepenultima, ... posicoes de "b"
		}
		System.out.printf("Os elementos do vetor 'A' estao invertidos no vetor 'B'.n");
		for( i = 0 ; i < n ; i++){
			System.out.printf("vetorA[%d] = %2d   vetorB[%d] = %2d\n", i, vetorA[i], i, vetorB[i]);
		}
		
	}
}
