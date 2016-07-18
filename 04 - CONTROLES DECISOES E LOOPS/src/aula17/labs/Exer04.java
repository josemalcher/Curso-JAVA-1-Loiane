package aula17.labs;

import java.util.Scanner;

public class Exer04 {
	/*
	 * Supondo que a população de um país A seja da ordem de 80000 habitantes
	 * com uma taxa anual de crescimento de 3% e que a população de B seja
	 * 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa
	 * que calcule e escreva o número de anos necessários para que a população
	 * do país A ultrapasse ou iguale a população do país B, mantidas as taxas
	 * de crescimento.
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// Dados população A
		System.out.println("Entre com a População A");
		int populacaoA = leitor.nextInt();

		System.out.println("Digite a TAXA de crescimento anual de A");
		double taxaCrescimentoA = leitor.nextDouble();

		// Dados população B
		System.out.println("Entre com a População B");
		int populacaoB = leitor.nextInt();

		System.out.println("DIgite a TAXA de crescimento anual de B");
		double taxaCrescimentoB = leitor.nextDouble();

		int anos = 0;

		while (populacaoA < populacaoB) {
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			anos++;
		}

		System.out.println("Em " + anos + " Anos a população de A vai se igualar ou superar B");

	}

}
