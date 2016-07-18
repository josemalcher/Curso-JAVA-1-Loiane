package aula17.labs;

import java.util.Scanner;

public class Exer04 {
	/*
	 * Supondo que a popula��o de um pa�s A seja da ordem de 80000 habitantes
	 * com uma taxa anual de crescimento de 3% e que a popula��o de B seja
	 * 200000 habitantes com uma taxa de crescimento de 1.5%. Fa�a um programa
	 * que calcule e escreva o n�mero de anos necess�rios para que a popula��o
	 * do pa�s A ultrapasse ou iguale a popula��o do pa�s B, mantidas as taxas
	 * de crescimento.
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		// Dados popula��o A
		System.out.println("Entre com a Popula��o A");
		int populacaoA = leitor.nextInt();

		System.out.println("Digite a TAXA de crescimento anual de A");
		double taxaCrescimentoA = leitor.nextDouble();

		// Dados popula��o B
		System.out.println("Entre com a Popula��o B");
		int populacaoB = leitor.nextInt();

		System.out.println("DIgite a TAXA de crescimento anual de B");
		double taxaCrescimentoB = leitor.nextDouble();

		int anos = 0;

		while (populacaoA < populacaoB) {
			populacaoA += (populacaoA / 100) * taxaCrescimentoA;
			populacaoB += (populacaoB / 100) * taxaCrescimentoB;
			anos++;
		}

		System.out.println("Em " + anos + " Anos a popula��o de A vai se igualar ou superar B");

	}

}
