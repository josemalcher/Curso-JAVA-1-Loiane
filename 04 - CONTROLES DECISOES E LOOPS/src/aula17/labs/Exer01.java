package aula17.labs;

import java.util.Scanner;

public class Exer01 {
	/*
	 * 1. Faça um programa que peça uma nota, entre zero e dez. Mostre uma
	 * mensagem caso o valor seja inválido e continue pedindo até que o usuário
	 * informe um valor válido.
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		boolean verificador= true;
		
		while(verificador){
			System.out.println("Entre com um numero entre 0 e 10");
			double numero = leitor.nextDouble();
			if(numero <= 10){
				System.out.println("Número É Válido 0 e 10 " + numero);
				verificador = false;
			}else{
				verificador = true;
			}
				
		}
	}
}
