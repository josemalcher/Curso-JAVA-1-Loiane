package aula20.labs;

import java.util.Scanner;

public class Exerc03 {
	/*
	 * 3. Capture do teclado valores para preenchimento de uma matriz M 3x3.
	 * Ap�s a captura imprima a matriz criada e encontre a quantidade de n�meros
	 * pares, a quantidade de n�meros �mpares.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		for(int i = 0; i < numeros.length ; i++){
			for(int j = 0 ; j < numeros[i].length ; j++){
				System.out.println("Entre como valor da posi��o [" + i + "," + j + "]");
				numeros[i][j] = leitor.nextInt(); 
			}
		}
		
		int quantidadePares 	= 0 ; 
		int quantidadeImpares 	= 0 ;
		
		for(int i = 0 ; i < numeros.length ; i++){
			for(int j = 0; j < numeros[i].length ; j++){
				if(numeros[i][j] % 2 == 0){
					quantidadePares++;
				}else{
					quantidadeImpares++;
				}
			}
		}
		
		for(int i = 0 ; i< numeros.length ; i++){
			for(int j=0 ; j < numeros[i].length ; j++){
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
			System.out.println("Pares = " + quantidadePares);
			System.out.println("Impares = " + quantidadeImpares);
		
	}
}
