package aula17.labs;

import java.util.Scanner;

public class Exer36 {
	/*
	 * 36. Sendo H= 1 + 1/2 + 1/3 + 1/4 + ... + 1/N, Faça um programa que
	 * calcule o valor de H com N termos.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digire o valor de n");
		
		int n = leitor.nextInt();
		
		double soma = 0; 
		
		for(int i=1, j = 1; i<=n ; i++, j+=2){
			System.out.print( i + "/"+ j + " + ");
			soma += i/j;
		}
		System.out.println("\n SOMA "+ soma);
	}
	
}
