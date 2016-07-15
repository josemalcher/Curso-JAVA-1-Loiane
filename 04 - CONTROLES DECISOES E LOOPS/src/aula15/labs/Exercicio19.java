package aula15.labs;

import java.util.Scanner;

public class Exercicio19 {
	/*
	 * 19. Faça um Programa que leia 2 números e em seguida pergunte ao usuário
	 * qual operação ele deseja realizar. O resultado da operação deve ser
	 * acompanhado de uma frase que diga se o número é: . par ou ímpar; a.
	 * positivo ou negativo;
	 */
		// Resolução da Loiane!!
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor");
		double valor1 = leitor.nextInt();
		
		System.out.println("Entre com o Segundo Valor");
		double valor2 = leitor.nextInt();
		
		System.out.println("Qual operação: + - * ou / ");
		String operador = leitor.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch(operador){
		case "+": resultado = valor1 + valor2 ; break;
		case "-": resultado = valor1 - valor2 ; break;
		case "*": resultado = valor1 * valor2 ; break;
		case "/": resultado = valor1 / valor2 ; break;
		default:
			System.out.println("Operação Inválida");
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
				System.out.println("Resultado é PAR");
			}else{
				System.out.println("Resultado é IMPAR");
			}
		}
		
	}
}
