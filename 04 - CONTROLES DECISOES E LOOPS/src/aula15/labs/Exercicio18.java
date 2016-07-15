package aula15.labs;

import java.util.Scanner;

public class Exercicio18 {
	/*
	 * 18. Faça um Programa que peça um número inteiro e determine se ele é par
	 * ou impar. Dica: utilize o operador módulo (resto da divisão).
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = leitor.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("O número é PAR");
		}else{
			System.out.println("O número é IMPAR");
		}
		
	}
}
