package aula17.labs;

import java.util.Scanner;

public class Exer28 {
	/*
	 * 28. Os números primos possuem várias aplicações dentro da Computação, por
	 * exemplo na Criptografia. Um número primo é aquele que é divisível apenas
	 * por um e por ele mesmo. Faça um programa que peça um número inteiro e
	 * determine se ele é ou não um número primo.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero para verificar");
		int numero = leitor.nextInt();
		
		boolean primo = true;
		
		for( int i = 2 ; i < numero; i++){
			if(numero % i == 0){
				System.out.println("Não é primo - divisil por " + i);
				primo = false;
			}
		}
		if(primo){
			System.out.println("é numeor primo");
		}
		
	}
}
