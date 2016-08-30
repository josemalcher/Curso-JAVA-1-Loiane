package aula52.labs;

import java.util.Scanner;

/*
 * Resolução loiane
 * https://github.com/loiane/curso-java-basico/tree/master/eclipse/curso-java-basico/src/com/loiane/cursojava/aula52/labs
 */
public class Teste {

	public static int obterOpcaoMenu(Scanner leitor) {
		boolean entradaValida = false;
		int opcao = 3;
		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: consultar contato");
			System.out.println("2: adicionar contato ");
			System.out.println("3: Sair ");

			try {
				String entrada = leitor.nextLine();
				opcao = Integer.parseInt(entrada);
				if (opcao == 1 || opcao == 2 || opcao == 3) {
					entradaValida = true;

				} else {
					throw new Exception("Entrada in´valida \n");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida, digite novamente \n");
			}

		}
		return opcao;
	}

	public static String leInformacaoString(Scanner leitor, String msg) {
		System.out.println(msg);
		String entrada = leitor.nextLine();
		return entrada;
	}

	public static void consultarContato(Scanner leitor, Agenda agenda) {
		String nomeContato = leInformacaoString(leitor, "Entre com o nome do contato");
		try {
			if (agenda.consultaContatoNome(nomeContato) >= 0) {
				System.out.println("COntato existe");
			}
		} catch (ContatoNaoExisteException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void adicionarContato(Scanner leitor, Agenda agenda) {

		try {
			System.out.println("Criando um contato! Digite as informações");
			String nome = leInformacaoString(leitor, "Entre com o nome");
			String telefone = leInformacaoString(leitor, "Entre com o telefone");
			String email = leInformacaoString(leitor, "Entre com o email");

			Contato contato = new Contato();
			contato.setNome(nome);
			contato.setTelefone(telefone);
			contato.setEmail(email);

			System.out.println("Contato Criado: ");
			System.out.println(contato); // toString

			agenda.adicionarContato(contato);
		} catch (AgendaCheiaException e) {

			System.out.println(e.getMessage());

			System.out.println("Contatos da Agenda");
			System.out.println(agenda);
		}

	}

	public static void main(String[] args) {
		/*
		 * Contato c1 = new Contato(); System.out.println(c1);
		 * 
		 * Contato c2 = new Contato(); System.out.println(c2);
		 * 
		 * Contato c3 = new Contato(); System.out.println(c3);
		 */

		Scanner leitor = new Scanner(System.in);

		Agenda agenda = new Agenda();

		int opcao = 1;
		while (opcao != 3) {
			opcao = obterOpcaoMenu(leitor);

			if (opcao == 1) { // consultar contatos
				consultarContato(leitor, agenda);
			} else if (opcao == 2) {
				adicionarContato(leitor, agenda);
			} /*else if (opcao == 3) {
				System.exit(0);
			}*/
		}

	}
}
