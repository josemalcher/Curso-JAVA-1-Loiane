package aula17.labs;

import java.util.Scanner;

public class Exer18 {
	/*
	 * 18. Faça um programa que peça um número inteiro e determine se ele é ou
	 * não um número primo. Um número primo é aquele que é divisível somente por
	 * ele mesmo e por 1.
	 */
	//resolução loiane + 

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero");
		
		int numero = leitor.nextInt();
		
		boolean primo = true;
		
		for(int i= 2 ; i < numero; i++ ){
			if(numero % i == 0){
				System.out.println("Não é primo - É divisivel por: "+ i);
				primo = false;
			}
		}
		
		if(primo){
			System.out.println("É Primo: "+numero);
		}
		
		
		
		
	}
}
