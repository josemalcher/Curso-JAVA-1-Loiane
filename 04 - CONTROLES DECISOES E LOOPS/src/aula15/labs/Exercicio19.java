package aula15.labs;

import java.util.Scanner;

public class Exercicio19 {
	/*
	 * 19. Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio
	 * qual opera��o ele deseja realizar. O resultado da opera��o deve ser
	 * acompanhado de uma frase que diga se o n�mero �: . par ou �mpar; a.
	 * positivo ou negativo;
	 */
		// Resolu��o da Loiane!!
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor");
		double valor1 = leitor.nextInt();
		
		System.out.println("Entre com o Segundo Valor");
		double valor2 = leitor.nextInt();
		
		System.out.println("Qual opera��o: + - * ou / ");
		String operador = leitor.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operador){
		case "+": resultado = valor1 + valor2 ; break;
		case "-": resultado = valor1 - valor2 ; break;
		case "*": resultado = valor1 * valor2 ; break;
		case "/": resultado = valor1 / valor2 ; break;
		default:
			System.out.println("Opera��o Inv�lida");
			valida = false;
		}
		
		if(valida){
			System.out.println("Resultado =" + resultado);
			if(resultado >= 0){
				System.out.println("Resultado Positivo");
			}else{
				System.out.println("Resultado Negativo");
			}
			if(resultado % 2 == 0){
				System.out.println("Resultado � PAR");
			}else{
				System.out.println("Resultado � IMPAR");
			}
		}
		
	}
}
