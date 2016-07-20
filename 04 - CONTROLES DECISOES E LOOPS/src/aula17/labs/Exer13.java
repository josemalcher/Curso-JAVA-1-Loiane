package aula17.labs;

import java.util.Scanner;

public class Exer13 {
	/*
	 * 13 - Faça um programa que peça dois números, base e expoente, calcule e
	 * mostre o primeiro número elevado ao segundo número. Não utilize a função
	 * de potência da linguagem.
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
		System.out.println("Potência = "+potencia);
	}

}
