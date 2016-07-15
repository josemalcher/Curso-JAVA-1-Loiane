package aula15.labs;

import java.util.Scanner;

public class Exercicio17 {
	/*
	 * 17. Faça um Programa que peça um número correspondente a um determinado
	 * ano e em seguida informe se este ano é ou não bissexto.
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Ano");
		
		int ano = leitor.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println(" É ano Bissexto");
		}else{
			System.out.println("Não é bissexto!");
		}
		
	}
}
