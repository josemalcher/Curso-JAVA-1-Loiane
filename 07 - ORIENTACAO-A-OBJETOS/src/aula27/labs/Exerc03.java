package aula27.labs;

import java.util.Scanner;

public class Exerc03 {
	/*
	 * 3. Escreva uma class para representar um Aluno. Adicione atributos
	 * relacionados às caracteristicas de um Aluno, como nome, matricula, curso
	 * que está matriculado, nome de 3 disciplinas que está cursando e as notas
	 * dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
	 * aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva
	 * um programa para testar essa classe, que pede as informações do aluno ao
	 * usuário e ao final informa o nome das disciplinas, mostra as notas e
	 * mostra se o aluno foi aprovado ou não.
	 * 
	 * resolução Loiane
	 */

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Aluno aluno01 = new Aluno();

		System.out.println("Nome do aluno:");
		aluno01.nome = leitor.next();

		System.out.println("Entre com o nome do curso");
		aluno01.nomeCurso = leitor.next();

		System.out.println("Entre com a matricula");
		aluno01.matricula = leitor.next();

		// aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno01.nomeDisciplinas.length; i++) {
			System.out.println("Entre com o nome da disciplina: " + i);
			aluno01.nomeDisciplinas[i] = leitor.next();
		}

		for (int i = 0; i < aluno01.notasDisciplinas.length; i++) {
			System.out.println("Obtendo notas das disciplina " + aluno01.nomeDisciplinas[i]);

			for (int j = 0; j < aluno01.notasDisciplinas[i].length; j++) {
				System.out.println("Entre com a nota " + (j+1));
				aluno01.notasDisciplinas[i][j] = leitor.nextDouble();
			}
		}

		aluno01.mostraInfo();

		for (int i = 0; i < aluno01.nomeDisciplinas.length; i++) {
			if (aluno01.verificaAprovado(i)) {
				System.out.println("Disciplina " + aluno01.nomeDisciplinas[i] + " - foi APROVADI");
			} else {
				System.out.println("Disciplina " + aluno01.nomeDisciplinas[i] + " - REPROVADO");
			}
		}

	}

}
