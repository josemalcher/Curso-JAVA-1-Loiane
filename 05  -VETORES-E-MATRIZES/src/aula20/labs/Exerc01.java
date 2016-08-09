package aula20.labs;

import java.util.Random;

public class Exerc01 {
	/*
	 * 1. Gere e imprima uma matriz M 4x4 com valores aleat�rios entre 0- 9.
	 * Ap�s isso determine o maior n�mero da matriz e a sua posi��o (linha,
	 * coluna).
	 */
	public static void main(String[] args) {
		int[][] numerosAleatorios = new int[4][4];
		
		Random numeroRamdom = new Random();
		
		for(int i = 0 ; i < numerosAleatorios.length ; i++){
			for(int j = 0 ; j < numerosAleatorios[i].length ; j++){
				numerosAleatorios[i][j] = numeroRamdom.nextInt(100);
			}
		}
		
		int maior = 0;
		int linha = 0; 
		int colun = 0;
		for(int i = 0 ; i < numerosAleatorios.length ; i++){
			for(int j = 0 ; j < numerosAleatorios[i].length ; j++){
				if(numerosAleatorios[i][j] > maior){
					maior = numerosAleatorios[i][j];
					linha = i;
					colun = j;
				}
			}
		}
		
		for(int i = 0 ; i < numerosAleatorios.length ; i++){
			for (int j = 0 ; j < numerosAleatorios[i].length ; j++){
				System.out.print(numerosAleatorios[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("Maior valor = " + maior);
		System.out.println("Linha = "+ linha);
		System.out.println("Coluna = "+ colun);	
	}
}
