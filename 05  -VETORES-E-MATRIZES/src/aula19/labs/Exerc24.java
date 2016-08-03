package aula19.labs;

import java.util.Scanner;

public class Exerc24 {
	/*
	 * 24. N�meros pal�ndromos s�o aqueles que escritos da direita para a
	 * esquerda t�m o mesmo valor quando escritos da esquerda para a direita.
	 * Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um programa que
	 * verifique se um dado vetor A de 10 elementos inteiros � um pal�ndromo, ou
	 * seja, se o primeiro elemento do vetor e igual ao �ltimo, se o segundo
	 * elemento do vetor � igual ao pen�ltimo e assim por diante at� verificar
	 * todos os elementos ou chegar a conclus�o que o vetor n�o � um pal�ndromo.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.printf("Informe %2do. elemento %d: ",(i+1), vetorA.length);
			vetorA[i] = leitor.nextInt();
		}
		
		int i = 0 ; // posi��o iniciais do vetor
		int j = (vetorA.length - 1); //posi��es finais do vetor
		boolean ePalindromo = true; //flag eh palindromo ou n�o
		
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
			System.out.println("Os elementos do vetor n�o formam um palindromo");
		}
		
	}
	
}
