package aula19.labs;

import java.util.Scanner;

public class Exerc26 {
	/*
	 * 26. Criar dois vetores A e B cada um com 10 elementos inteiros. 
	 * Construir um vetor C de mesmo tipo e tamanho, obedecendo as seguintes regras de
	 * formação: 
	 * a) Ci deverá receber 1 quando Ai for maior que Bi; 
	 * b) Ci deverá receber 0 quando Ai for igual a Bi; 
	 * c) Ci deverá receber -1 quando Ai for menor que Bi.
	 */
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorc = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o numero para posição A = " + i);
			vetorA[i] = leitor.nextInt();
		}

		for (int i = 0; i < vetorB.length; i++) {

			System.out.println("Entre com um numero para posição A = " + i);
			vetorB[i] = leitor.nextInt();

			if (vetorA[i] == vetorB[i]) {
				vetorc[i] = 0;
			} else if (vetorA[i] > vetorB[i]) {
				vetorc[i] = 1;
			} else {
				vetorc[i] = -1;
			}

		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorc.length; i++) {
			System.out.print(vetorc[i] + " ");
		}
		System.out.println();
		 */
		
		//Resolução M.Sc. Omero Francisco B.
		
		int n = 10;
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n];
		int i;
		
		for( i = 0; i < n ; i++){
			vetorA[i] = (int)Math.round(Math.random() * 100);
			vetorB[i] = (int)Math.round(Math.random() * 100);
		}
		
		for( i = 0 ; i < n ; i++){
			if(vetorA[i] < vetorB[i]){
				vetorC[i] = 1;
			}else if(vetorA[i] == vetorB[i]){
				vetorC[i] = 0;
			}else{
				vetorC[i] = -1;
			}
		}
		
		System.out.printf("-----------------------------\n");
		System.out.printf("i    a[i]    b[i]    c[i]    \n");
		for(i=0; i < n ; i++){
			System.out.printf("%d    %4d    %4d    %4d    \n",i,vetorA[i],vetorB[i],vetorC[i]);
		}
		System.out.printf("-----------------------------\n");
		
		
	}

}
