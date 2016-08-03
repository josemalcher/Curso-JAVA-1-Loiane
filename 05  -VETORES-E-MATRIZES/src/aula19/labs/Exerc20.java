package aula19.labs;

import java.util.Scanner;

public class Exerc20 {
	/*
	 * 20. Implementar um programa que obtenha a cota��o do d�lar (U$) em
	 * rela��o ao real (R$) e a seguir armazene em vetor A com 20 elementos as
	 * seguintes convers�es: 
	 * A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a COta��o do D�lar: ");
		cotacao = leitor.nextDouble();
		
		//A[i] = cota��o do dolar * i, para todo i variando de 1 at� 20.
		for (int i = 0 ; i < vetorA.length ; i++){
			vetorA[i] = cotacao * (i + 1);
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0 ; i< vetorA.length ; i++){
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
	}
	
}
