package aula17.labs;

import java.util.Scanner;

public class Exer29 {
	/*
	 * 29. Encontrar n�meros primos � uma tarefa dif�cil. Fa�a um programa que
	 * gera uma lista dos n�meros primos existentes entre 1 e um n�mero inteiro
	 * informado pelo usu�rio.
	 * 
	 * Resolu��o Loiane
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
					//System.out.println("N�o � primo - divis�vel por "+ i);
					primo = false;
				}
			}
			if(primo){
				System.out.println(i);
			}
		}
	}
	
}
