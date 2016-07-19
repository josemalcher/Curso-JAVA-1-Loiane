package aula17.labs;

import java.util.Scanner;

public class Exer05_loiane {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double populacaoA;
		double populacaoB;
		double taxaA;
		double taxaB;

		// POPULACAO
		boolean validador = false;
		do {
			System.out.println("Entre com a popula��o A: ");
			populacaoA = leitor.nextDouble();

			if (populacaoA > 0) {
				validador = true;
			} else {
				System.out.println("Popula��o 'A' precisa ser maior que 0 ");
			}

		} while (!validador);

		// TAXA DA POPULACAO A
		validador = false;
		do {
			System.out.println("Entre com a TAXA da popula��o A: ");
			taxaA = leitor.nextDouble();

			if (taxaA > 0) {
				validador = true;
			} else {
				System.out.println("A TAXA da Popula��o 'A' precisa ser maior que 0 ");
			}
		} while (!validador);

		// POPULACAO B
		validador = false;
		do {
			System.out.println("Entre com a popula��o B: ");
			populacaoB = leitor.nextDouble();

			if (populacaoB > 0) {
				validador = true;
			} else {
				System.out.println("Popula��o 'B' precisa ser maior que 0 ");
			}
		} while (!validador);

		// TAXA DA POPULACAO B
		validador = false;
		do {
			System.out.println("Entre com a TAXA da popula��o B: ");
			taxaB = leitor.nextDouble();

			if (taxaB > 0) {
				validador = true;
			} else {
				System.out.println("A TAXA da Popula��o 'B' precisa ser maior que 0 ");
			}
		} while (!validador);
		
		int anos = 0;
		
		while(populacaoA < populacaoB){
			populacaoA += (populacaoA/100)*taxaA;
			populacaoB += (populacaoB/100)*taxaB;
			anos++;
		}
		System.out.println("Popula��o A: "+populacaoA);
		System.out.println("Popula��o B: "+populacaoB);
		System.out.println("Quantos anos "+ anos);
	}
}
