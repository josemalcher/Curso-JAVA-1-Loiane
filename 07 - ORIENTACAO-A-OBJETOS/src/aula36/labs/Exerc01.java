package aula36.labs;

import java.util.Scanner;

public class Exerc01 {
	/*
	 * 1. Escreva uma classe Agenda, que contém vários contatos do tipo Contato.
	 * Cada contato possui nome, telefone e email. A Agenda também possui um
	 * nome. Crie um programa teste que peça para o usuário entrar com o nome da
	 * Agenda e em seguida 3 contatos. Crie métodos que retornem uma String com
	 * a informação de cada contato e também de todos os contatos da agenda.
	 */
	public static void main(String[] args) {
		Scanner leitor  = new Scanner(System.in);
		
		System.out.println("Enre com o nome da Agenda");
		String nome = leitor.next();
				
		Agenda agenda = new Agenda();
		
		Contato[] contatos = new Contato[3];
		
		for(int i = 0 ; i < 3 ; i++){
			System.out.println("Entre com as infrmações do contato"+ (i + 1));
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
