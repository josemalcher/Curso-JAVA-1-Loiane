package aula17.labs;

import java.util.Scanner;

public class Exer29 {
	/*
	 * 29. Encontrar números primos é uma tarefa difícil. Faça um programa que
	 * gera uma lista dos números primos existentes entre 1 e um número inteiro
	 * informado pelo usuário.
	 * 
	 * Resolução Loiane
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = leitor.nextInt();
		
		boolean primo;
		
		for( int i = 1 ; i <= numero ; i++){
			primo = true;
			
			for(int j = 2 ; j < i ; j++){
				if( i % j == 0){
					//System.out.println("Não é primo - divisível por "+ i);
					primo = false;
				}
			}
			if(primo){
				System.out.println(i);
			}
		}
	}
	
}
