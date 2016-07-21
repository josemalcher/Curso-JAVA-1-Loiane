package aula17.labs;

import java.util.Scanner;

public class Exer21 {
	/*
	 * 21. Fa�a um programa que calcule o n�mero m�dio de alunos por turma. Para
	 * isto, pe�a a quantidade de turmas e a quantidade de alunos para cada
	 * turma. As turmas n�o podem ter mais de 40 alunos.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a quantidade de turmas");
		int turmas = leitor.nextInt();
		int alunos;
		int soma = 0;
		boolean invalido = true;

		for (int i = 1; i <= turmas; i++) {
			invalido = true;
			do {
				System.out.println("Digite a quantidade de Alunos da turma " + i);
				alunos = leitor.nextInt();

				if (alunos <= 40) {
					invalido = false;
				} else {
					System.out.println("N�mero de alunos inv�lido, n�o pode passar mais que 40");
				}
			} while (invalido);

			soma += alunos;

		}
		double media = soma / turmas;

		System.out.println("M�dia de alunos por turma = " + media);

	}
}
