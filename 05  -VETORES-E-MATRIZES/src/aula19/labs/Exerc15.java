package aula19.labs;

import java.util.Scanner;

public class Exerc15 {
/*
 * 15. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
que defina o percentual de elementos pares e ímpares,
respectivamente, armazenados neste vetor.
RESOLUÇÃO Loiane
 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite vetor A - "+ i);
			vetorA[i] = leitor.nextInt();
		}
		
		int totalImpar = 0;
		for(int i = 0 ; i < vetorA.length ; i++){
			if(vetorA[i] % 2 != 0){
				totalImpar++;
			}
		}
		
		int totalPar = vetorA.length - totalImpar;
		
		/*
		 * Explicação
		 * vetorA.lenght - 100%
		 * par			 -   X
		 * X * vetorA.lenght = (par * 100) / vetorA.lenght
		 *  X == (par * 100)/vetorA.lenght
		 * 
		 */
		double porcenPar = (totalPar * 100)/vetorA.length;
		double porcenImpar = 100 - porcenPar;
		
		System.out.print("Vetor A = ");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		System.out.println("Porcentagem de Pares = "+porcenPar);
		System.out.println("Porcentagem de IMpares = "+porcenImpar);
		
	}
}
