package aula17.labs;

import java.util.Scanner;

public class Exer01 {
	/*
	 * 1. Fa�a um programa que pe�a uma nota, entre zero e dez. Mostre uma
	 * mensagem caso o valor seja inv�lido e continue pedindo at� que o usu�rio
	 * informe um valor v�lido.
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		boolean verificador= true;
		
		while(verificador){
			System.out.println("Entre com um numero entre 0 e 10");
			double numero = leitor.nextDouble();
			if(numero <= 10){
				System.out.println("N�mero � V�lido 0 e 10 " + numero);
				verificador = false;
			}else{
				verificador = true;
			}
				
		}
	}
}
