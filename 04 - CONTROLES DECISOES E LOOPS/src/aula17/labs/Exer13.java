package aula17.labs;

import java.util.Scanner;

public class Exer13 {
	/*
	 * 13 - Fa�a um programa que pe�a dois n�meros, base e expoente, calcule e
	 * mostre o primeiro n�mero elevado ao segundo n�mero. N�o utilize a fun��o
	 * de pot�ncia da linguagem.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor da Base");
		int base = leitor.nextInt();
		System.out.println("Digite o Expoente");
		int expoente = leitor.nextInt();
		
		int potencia = 1;
		for(int i = expoente; i > 0 ; i--){
			potencia *= base;
		}
		System.out.println("Pot�ncia = "+potencia);
	}

}
