package aula17.labs;

import java.util.Scanner;

public class Exer19 {
	/*
	 * 19. Faça um programa que calcule o mostre a média aritmética de N notas.
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas notas Registradas ");
		int notas = leitor.nextInt();
		
		double soma = 0;
		double media;
		double nota;
		
		for (int i=0; i < notas ; i++){
			System.out.println("Enre com a notas: "+ (i+1));
			nota = leitor.nextDouble();
			
			soma += nota;
		}
		
		media = soma / notas;
		
		System.out.println("SOMA "+soma);
		System.out.println("Média "+ media);
	}
}
