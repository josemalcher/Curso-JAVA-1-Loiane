package aula19.labs;

import java.util.Scanner;

public class Exerc24 {
	/*
	 * 24. Números palíndromos são aqueles que escritos da direita para a
	 * esquerda têm o mesmo valor quando escritos da esquerda para a direita.
	 * Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que
	 * verifique se um dado vetor A de 10 elementos inteiros é um palíndromo, ou
	 * seja, se o primeiro elemento do vetor e igual ao último, se o segundo
	 * elemento do vetor é igual ao penúltimo e assim por diante até verificar
	 * todos os elementos ou chegar a conclusão que o vetor não é um palíndromo.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.printf("Informe %2do. elemento %d: ",(i+1), vetorA.length);
			vetorA[i] = leitor.nextInt();
		}
		
		int i = 0 ; // posição iniciais do vetor
		int j = (vetorA.length - 1); //posições finais do vetor
		boolean ePalindromo = true; //flag eh palindromo ou não
		
		while ((i < j)&& (ePalindromo == true)){
			if(vetorA[i] != vetorA[j]){
				ePalindromo = false;
			}else{
				i++;
				j--;
			}
		}
		
		if(ePalindromo == true){
			System.out.println("Os elementos do vetor formam um palindromo");
		}else{
			System.out.println("Os elementos do vetor não formam um palindromo");
		}
		
	}
	
}
