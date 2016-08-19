package aula36.labs;

import java.util.Scanner;

public class Exerc01 {
	/*
	 * 1. Escreva uma classe Agenda, que cont�m v�rios contatos do tipo Contato.
	 * Cada contato possui nome, telefone e email. A Agenda tamb�m possui um
	 * nome. Crie um programa teste que pe�a para o usu�rio entrar com o nome da
	 * Agenda e em seguida 3 contatos. Crie m�todos que retornem uma String com
	 * a informa��o de cada contato e tamb�m de todos os contatos da agenda.
	 */
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		System.out.println("Enre com o nome da Agenda");
		String nome = leitor.next();
				
		Agenda agenda = new Agenda();
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("Entre com as infrma��es do contato"+ (i + 1));
			Contato contato = new Contato();
			
			System.out.println("Ente com o nome ");
			nome = leitor.nextLine();
			contato.setNome(nome);
			
			System.out.println("Entre com o telefone");
			String telefone = leitor.nextLine();
			contato.setTelefone(telefone);
			
			System.out.println("Entre com o email");
			String email = leitor.nextLine();
			contato.setEmail(email);
			
			contatos[i] = contato;
			
		}
		
		agenda.setContatos(contatos);
		
		if(agenda != null){
			System.out.println(agenda.obterInfo());
		}
		
		
	}
}
