package aula19.labs;

import java.util.Scanner;

public class Exerc20 {
	/*
	 * 20. Implementar um programa que obtenha a cotação do dólar (U$) em
	 * relação ao real (R$) e a seguir armazene em vetor A com 20 elementos as
	 * seguintes conversões: 
	 * A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Entre com a COtação do Dólar: ");
		cotacao = leitor.nextDouble();
		
		//A[i] = cotação do dolar * i, para todo i variando de 1 até 20.
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
