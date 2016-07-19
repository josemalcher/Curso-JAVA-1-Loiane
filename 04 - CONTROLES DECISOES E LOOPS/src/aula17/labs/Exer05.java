package aula17.labs;

import java.util.Scanner;

public class Exer05 {
	/*
	 * Altere o programa anterior permitindo ao usuário informar as populações e
	 * as taxas de crescimento iniciais. Valide a entrada e permita repetir a
	 * operação.
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
		do {
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			anos++;
		} while (populacaoA < populacaoB || populacaoA > populacaoB);

		if (taxaCrescimentoA < taxaCrescimentoB) {
			System.out.println("Em " + anos + " Anos a população de A vai se igualar ou superar B");
		}else{
			System.out.println("Em " + anos + " Anos a população de B vai se igualar ou superar A");
		}

	}
}
