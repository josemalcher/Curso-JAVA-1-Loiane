package aula17.labs;

import java.util.Scanner;

public class Exer34 {
	/*
	 * 34. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
	 * calcule o valor de H com N termos.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor de n ");
		int n = leitor.nextInt();
		
		double soma = 0;
		
		for(int i = 1; i <= n; i++){
			soma += 1/i;
		}
		
		System.out.println("Soma " + soma);
		
	}
}
