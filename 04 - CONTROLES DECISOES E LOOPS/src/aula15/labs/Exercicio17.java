package aula15.labs;

import java.util.Scanner;

public class Exercicio17 {
	/*
	 * 17. Fa�a um Programa que pe�a um n�mero correspondente a um determinado
	 * ano e em seguida informe se este ano � ou n�o bissexto.
	 */
	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Ano");
		
		int ano = leitor.nextInt();
		
		if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)){
			System.out.println(" � ano Bissexto");
		}else{
			System.out.println("N�o � bissexto!");
		}
		
	}
}
