package aula19.labs;

import java.util.Scanner;

public class Exerc25 {
	/*
	 * 25. Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
	 * mesmo tipo e tamanho, obedecendo as seguintes regras de formação: 
	 * a) Bi deverá receber 1 quando Ai for par; 
	 * b) Bi deverá receber 0 quando Ai for ímpar.
	 * 
	 */
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for(int i = 0; i < vetorA.length ; i++){
			System.out.println("Entre com o numero para posição "+ i);
			vetorA[i] = leitor.nextInt();
			
			vetorB[i] = (vetorA[i] % i ==0) ? 1 : 0;
		}
		
		System.out.print("Vetor A = ");
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for(int i = 0; i< vetorB.length ; i++){
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();
		*/
		int vetorA[] = new int[10];
		int vetorB[] = new int[vetorA.length];
		
		for( int i = 0 ; i < vetorA.length ; i++){
			vetorA[i] = (int)Math.round(Math.random()*100); //numero no intervalo de 0..100
		}
		
		for(int i = 0 ; i < vetorA.length ; i++){
			if((vetorA[i] % 2) == 0){
				vetorB[i] = 1;
			}else{
				vetorB[i] = 0;
			}
		}
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.printf("VetorA[%d] = %2d   VetorB[%d] = %d \n",i,vetorA[i],i,vetorB[i]);
		}
		
	}
}
