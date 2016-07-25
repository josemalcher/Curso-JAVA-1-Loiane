package aula17.labs;

import java.util.Scanner;

public class Exer27 {
	/*
	 * 27. O Departamento Estadual de Meteorologia lhe contratou para
	 * desenvolver um programa que leia as um conjunto indeterminado de
	 * temperaturas, e informe ao final a menor e a maior temperaturas
	 * informadas, bem como a média das temperaturas.
	 * 
	 * Resolução Loiane
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantas temperaturas");
		int quantidadeTemperaturas = leitor.nextInt();
		
		double temperatura;
		double soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_NORMAL;
		
		for(int i = 1 ; i <= quantidadeTemperaturas ; i++){
			System.out.println("Entre com a temperatura "+ i);
			
			temperatura = leitor.nextDouble();
			soma += temperatura;
			
			if(temperatura > maior){
				maior = temperatura;
			}
			if(temperatura < menor){
				menor = temperatura;
			}
		}

		System.out.println("Média "+ (soma / quantidadeTemperaturas));
		System.out.println("Menor Temperatura "+ menor);
		System.out.println("Maior Temperatura "+ maior);
		
		
		
	}
}
