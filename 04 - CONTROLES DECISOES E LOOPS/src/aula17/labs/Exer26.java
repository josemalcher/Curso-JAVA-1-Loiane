package aula17.labs;

import java.util.Scanner;

public class Exer26 {
	/*
	 * 26. Fa�a um programa que calcule o fatorial de um n�mero inteiro
	 * fornecido pelo usu�rio. Ex.: 5!=5.4.3.2.1=120. A sa�da deve ser conforme
	 * o exemplo abaixo: o Fatorial de: 5 
	 * o 5! = 5 . 4 . 3 . 2 . 1 = 120
	 * 
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um numero para O fatorial...");
		
		int numero = leitor.nextInt();
		
		System.out.println("Fatorial de "+numero);
		
		System.out.print(numero + "! = ");
		
		int fatorial = 1;
		for(int i = numero; i > 1; i--){
			fatorial *= i;
			System.out.print(i + " . ");
		}
		System.out.println(" 1 = "+ fatorial);
	}
}
