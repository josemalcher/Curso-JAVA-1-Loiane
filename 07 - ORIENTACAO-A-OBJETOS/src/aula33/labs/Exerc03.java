package aula33.labs;

import java.util.Scanner;

public class Exerc03 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exercícios, criando todos os atributos do tipo
	 * privado, métodos getters e setters e construtores. Os métodos que serão
	 * utilizados pela classe de teste devem ser públicos. Se necessário, crie
	 * métodos privados como auxiliares para organizar melhor o código fonte
	 * também.
	 * 
	 * 3. Escreva uma classe para representar um Aluno. Adicione atributos
	 * relacionados às caracteristicas de um Aluno, como nome, matricula, curso
	 * que está matriculado, nome de 3 disciplinas que está cursando e as notas
	 * dessas 3 disciplinas. Desenvolva um método para verificar se o aluno está
	 * aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva
	 * um programa para testar essa classe, que pede as informações do aluno ao
	 * usuário e ao final informa o nome das disciplinas, mostra as notas e
	 * mostra se o aluno foi aprovado ou não.
	 * 
	 * resolução LOIANE
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.println("Entre com o nome do aluno");
		aluno.setNome(scan.next());

		System.out.println("Entre com o nome do curso");
		aluno.setNomeCurso(scan.next());

		System.out.println("Entre com a matricula");
		aluno.setMatricula(scan.next());

		// aluno.nomeDisciplinas = new String[3];
		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			System.out.println("Entre com o nome da disciplina " + i);
			aluno.setNomeDisciplinaPos(i, scan.next());
		}

		for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
			System.out.println("Obtendo notas da disciplina " + aluno.getNomeDisciplinas()[i]);
			for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
				System.out.println("Entre com a nota " + (j + 1));
				aluno.setNomePosIJ(i, j, scan.nextDouble());
			}
		}

		aluno.mostrarInfo();

		for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
			if (aluno.verificarAprovado(i)) {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - foi aprovado");
			} else {
				System.out.println("Disciplina " + aluno.getNomeDisciplinas()[i] + " - reprovado");
			}
		}
	}

}
