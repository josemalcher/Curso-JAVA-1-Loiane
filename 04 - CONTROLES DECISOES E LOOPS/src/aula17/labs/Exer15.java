package aula17.labs;

import java.util.Scanner;

public class Exer15 {
	/*
	 * A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
	 * Faça um programa capaz de gerar a série até o n−ésimo termo.
	 */
	//solucao Loiane

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o n=esimo termo da série de fibonacci: ");
		int numero = leitor.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		
		for(int i=3 ; i<= numero; i++){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
		
		
		
		
	}
}
