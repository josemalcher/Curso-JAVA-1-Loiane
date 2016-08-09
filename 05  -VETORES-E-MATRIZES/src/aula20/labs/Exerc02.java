package aula20.labs;

import java.util.Random;

public class Exerc02 {
	/*
	 * 2. Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9.
	 * Após isso indique qual é o maior e o menor valor da linha 5 e qual é o
	 * maior e o menor valor da coluna 7.
	 */
	public static void main(String[] args) {
		
		int[][] numerosALeattorios = new int[10][10];
		
		Random numRAndom = new Random();
		
		for(int i = 0 ;  i < numerosALeattorios.length ; i++){
			for(int j = 0 ; j < numerosALeattorios[i].length ; j++){
				numerosALeattorios[i][j] = numRAndom.nextInt(100);
			}
		}
		
		for(int i = 0 ; i < numerosALeattorios.length ; i++){
			for(int j = 0 ; j < numerosALeattorios[i].length ; j++){
				System.out.print(numerosALeattorios[i][j]+ " ");
			}
			System.out.println();
		}
		
		int maiorL5 = 0;
		int menorL5 = 101; //numero/valor máximo aleatório
		int linha5 = 5;
		for(int i = 0 ; i < numerosALeattorios[linha5].length ; i ++){
			if(numerosALeattorios[linha5][i] > maiorL5){
				maiorL5 = numerosALeattorios[linha5][i];
			}
			if(numerosALeattorios[linha5][i] < menorL5){
				menorL5 = numerosALeattorios[linha5][i];
			}
		}
		
		System.out.println();
		System.out.println("Maior Valor da linha 5 = "+ maiorL5);
		System.out.println("Menor valor da linha 5 = "+menorL5);
		
		int maiorC7 = 0;
        int menorC7 = 101;
        int col7 = 7;
        for (int i=0; i<numerosALeattorios.length; i++){
            if (numerosALeattorios[i][col7] > maiorC7){
                maiorC7 = numerosALeattorios[i][col7]; 
            }
            if (numerosALeattorios[i][col7] < menorC7){
                menorC7 = numerosALeattorios[i][col7]; 
            }
        }
        
        System.out.println("Maior valor da coluna 7 = " + maiorC7);
        System.out.println("Menor valor da coluna 7 = " + menorC7);
        
        
        
        
        
        
	}
}
