package aula15.labs;

import java.util.Scanner;

public class Exercicio18 {
	/*
	 * 18. Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par
	 * ou impar. Dica: utilize o operador m�dulo (resto da divis�o).
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com um numero");
		int numero = leitor.nextInt();
		
		if(numero % 2 == 0){
			System.out.println("O n�mero � PAR");
		}else{
			System.out.println("O n�mero � IMPAR");
		}
		
	}
}
