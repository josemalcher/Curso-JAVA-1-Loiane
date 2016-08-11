package aula20.labs;

import java.util.Scanner;

public class Exerc04 {
	/*
	 * 4. Faça um programa para armazenar em uma matriz os compromissos de uma
	 * agenda pessoal. Cada dia do mês deve conter 24 horas, onde para cada uma
	 * destas 24 horas podemos associar um tarefa específica (compromisso
	 * agendado). O programa deve ter um menu onde o usuário indica o dia do mês
	 * que deseja alterar e a hora, entrando em seguida com o compromisso, ou
	 * então, o usuário pode também consultar a agenda, fornecendo o dia e a
	 * hora para obter o compromisso armazenado.
	 * 
	 * Resolução da Loiane
	 * 
	 */
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		String[][] comprimissos = new String[31][24];

		boolean sair = false;
		byte opcao;

		while (!sair) {
			System.out.println("Digite 1 para adicionar comprimisso");
			System.out.println("Digite 2 para verificar comprimissos");
			System.out.println("digite 0 (zero) para sair");

			opcao = leitor.nextByte();

			if (opcao == 1) {

				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = leitor.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia não válido, digite entre 0 e 31");
					}
				}

				boolean horavalida = false;
				int hora = 0;

				while (!horavalida) {
					System.out.println("DIgite a hora do comprimisso");
					hora = leitor.nextInt();
					if (hora >= 0 && hora <= 24) {
						horavalida = true;
					} else {
						System.out.println("Hora inválida, digite novamente!!");
					}
				}

				dia--; // para caber na numeração do arry é feito esse ajuste
				System.out.println("Digite o compromisso");
				comprimissos[dia][hora] = leitor.next();

			} else if (opcao == 2) {

				boolean diaValido = false;
				int dia = 0;

				while (!diaValido) {
					System.out.println("Digite o DIA do mês: ");
					dia = leitor.nextInt();

					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Digite um DIA VALIDO!!, DIgite novamente");
					}
				}

				boolean horaValida = false;
				int hora = 0;

				while (!horaValida) {
					System.out.println("Entre com a hora do compromisso");
					hora = leitor.nextInt();

					if (hora >= 0 && hora <= 24) {
						horaValida = true;
					}

				}

				dia--;
				System.out.println("O comprimisso agendado é: ");
				System.out.println(comprimissos[dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			} else {
				System.out.println("Opção inválida, digite novamente");
			}

		}

	}
}
