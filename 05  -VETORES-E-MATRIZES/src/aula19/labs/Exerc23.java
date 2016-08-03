package aula19.labs;

import java.util.Scanner;

public class Exerc23 {
	/*
	 * 23. Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
	 * que verifique se "todos" os elementos do vetor A são pares. Se pelo menos
	 * um elemento do vetor não for par o processo de repetição para percorrer
	 * os elementos do vetor deve ser encerrado, como sugestão: utilize uma
	 * variável do tipo flag para atingir este propósito.
	 */
	public static void main(String[] args) {
/*		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		boolean todosPares;
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.printf("digite o %2do. elemento de %d: ", (i+1),vetorA.length);
			vetorA[i] = leitor.nextInt();
		}
		
		todosPares = true;
		for( int i = 0 ; i < vetorA.length && (todosPares ==true) ; i++){
			if( (vetorA[i] % 2) != 0){
				todosPares = false; // encontrou um impar
			}
		}
		if(todosPares == true){
			System.out.println("TOdoso os elementos são pares");
		}else{
			System.out.println("Nem todos são Pares");
		}
		
	*/	
		
		Scanner leitor = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for(int i = 0 ; i < vetorA.length ; i++){
			System.out.println("Digite os numeros "+ i );
			vetorA[i] = leitor.nextInt();
			
			if(vetorA[i] % 2 != 0 ){
				System.out.println("Entrou impar, FIM do sistema");
				break;
				
			}
		}
		
		
	}
}
