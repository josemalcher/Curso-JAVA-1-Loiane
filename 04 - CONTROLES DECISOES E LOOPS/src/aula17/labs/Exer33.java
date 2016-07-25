package aula17.labs;

import java.util.Scanner;

public class Exer33 {
	/*
	 * 33. Fa�a um programa que mostre os n termos da S�rie a seguir: o S = 1/1
	 * + 2/3 + 3/5 + 4/7 + 5/9 + ... + n/m. Imprima no final a soma da s�rie.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de n");
		int n = leitor.nextInt();
		
		double soma = 0;
		
		for(int i = 1, j = 1 ; i <= n ; i++ , j+=2 ){
			System.out.print(i + "/" + j +" + ");
			soma += i/j;
		}
		System.out.println("\n SOMA = " + soma);
	}
	
}
