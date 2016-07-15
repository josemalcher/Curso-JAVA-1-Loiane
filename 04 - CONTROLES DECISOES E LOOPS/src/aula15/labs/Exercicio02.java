package aula15.labs;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// 2. Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("DIgite qualquer valor, positivo ou negativo");
		int valor = leitor.nextInt();
		
		if(valor == 0){
			System.out.println("Valor é igual a Zero");
		}else if(valor < 0){
			System.out.println("Valor menor que zero, Valor Negativo");
		}else{
			System.out.println("Valor maior que zero, Valor Positivo");
		}

	}

}
