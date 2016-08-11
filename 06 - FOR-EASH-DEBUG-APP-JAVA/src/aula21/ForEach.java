package aula21;

import java.util.Random;

public class ForEach {
	public static void main(String[] args) {

		int[] notas = new int[10];

		Random random = new Random();

		for (int i = 0; i < notas.length; i++) {
			notas[i] = random.nextInt(10);
		}

		for (int i = 0; i < notas.length; i++) {
			int nota = notas[i];
			System.out.println(nota);
		}

		System.out.println("Usado o for EACH");

		for (int nota : notas) {
			System.out.println(nota);
		}

		// Exemplo com Arrys multidimensionais
		System.out.println("Exemplo com arrays multidimensionais");

		double[][] notasAlunos = new double[3][4];

		notasAlunos[0][0] = 10;
		notasAlunos[0][1] = 5;
		notasAlunos[0][2] = 8;
		notasAlunos[0][3] = 9.5;

		notasAlunos[1][0] = 5;
		notasAlunos[1][1] = 6;
		notasAlunos[1][2] = 7;
		notasAlunos[1][3] = 8;

		notasAlunos[2][0] = 4;
		notasAlunos[2][1] = 5;
		notasAlunos[2][2] = 9;
		notasAlunos[2][3] = 8;

		for (double[] notasAluno : notasAlunos) {
			for (double nota : notasAluno) {
				System.out.println(nota + " ");
			}
			System.out.println();
		}

	}
}
