package aula36.labs;

import java.util.Scanner;

public class Exerc02 {
	/*
	 * 2. Escreva uma classe para representar um Curso, que tem nome e hor�rio.
	 * Cada curso tem um Professor, que possui nome, departamento e email. Cada
	 * Curso tamb�m pode ter v�rios alunos (tipo Aluno). Cada Aluno tem nome,
	 * matricula e 4 notas. Escreva um programa teste que crie um Curso com 5
	 * alunos, e que pre�a para o usu�rio entrar com as 4 notas de cada aluno.
	 * Ao final, imprima a m�dia de cada aluno, se o mesmo est� aprovado (media
	 * maior ou igual a 7), e qual � a m�dia da turma.
	 * 
	 * Resolu��o da loiane
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o nome do curso:");
		String nome = scan.nextLine();

		System.out.println("Entre com o hor�rio do curso:");
		String horario = scan.nextLine();

		System.out.println("Entre com o nome do professor:");
		String nomeProf = scan.nextLine();

		System.out.println("Entre com o departamento do professor:");
		String depProf = scan.nextLine();

		System.out.println("Entre com o email do professor:");
		String emailProf = scan.nextLine();

		Curso curso = new Curso();
		curso.setNome(nome);
		curso.setHorario(horario);

		Professor professor = new Professor();
		professor.setNome(nomeProf);
		professor.setDepartamento(depProf);
		professor.setEmail(emailProf);

		curso.setProfessor(professor);

		System.out.println("---Alunos---");

		Aluno[] alunos = new Aluno[5];
		for (int i = 0; i < 5; i++) {

			scan.nextLine();

			System.out.println("Entre com o nome do aluno " + (i + 1));
			String nomeAluno = scan.nextLine();

			System.out.println("Entre com a matr�culo do ano:");
			String matAluno = scan.nextLine();

			double[] notas = new double[4];

			for (int j = 0; j < 4; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				notas[j] = scan.nextDouble();
			}

			Aluno aluno = new Aluno();
			aluno.setNome(nomeAluno);
			aluno.setMatricula(matAluno);
			aluno.setNotas(notas);

			alunos[i] = aluno;
		}

		curso.setAlunos(alunos);

		System.out.println(curso.obterInfo());

	}
}
