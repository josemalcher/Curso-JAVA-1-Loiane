package aula34.labs;

import java.util.Scanner;

public class Exerc03 {
	/*
	 * 3. Escreva um m�todo para calcular factorial de um n�mero na classe
	 * Calculadora do exerc�cio anterior.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int num;
		
		do{
			System.out.println("Digite o numero positivo");
			num = leitor.nextInt();
			
			if(num < 0){
				System.out.println("NUmero invalido");
			}
			
		}while(num < 0);
		System.out.println("Fatorial de "+ num + " = " + Calculadora.fatorial(num));
	}
}
