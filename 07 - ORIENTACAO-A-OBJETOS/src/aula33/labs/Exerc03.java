package aula33.labs;

import java.util.Scanner;

public class Exerc03 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exerc�cios, criando todos os atributos do tipo
	 * privado, m�todos getters e setters e construtores. Os m�todos que ser�o
	 * utilizados pela classe de teste devem ser p�blicos. Se necess�rio, crie
	 * m�todos privados como auxiliares para organizar melhor o c�digo fonte
	 * tamb�m.
	 * 
	 * 3. Escreva uma classe para representar um Aluno. Adicione atributos
	 * relacionados �s caracteristicas de um Aluno, como nome, matricula, curso
	 * que est� matriculado, nome de 3 disciplinas que est� cursando e as notas
	 * dessas 3 disciplinas. Desenvolva um m�todo para verificar se o aluno est�
	 * aprovado (nota maior ou igual a 7) em uma determinada disciplina. Escreva
	 * um programa para testar essa classe, que pede as informa��es do aluno ao
	 * usu�rio e ao final informa o nome das disciplinas, mostra as notas e
	 * mostra se o aluno foi aprovado ou n�o.
	 * 
	 * resolu��o LOIANE
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
