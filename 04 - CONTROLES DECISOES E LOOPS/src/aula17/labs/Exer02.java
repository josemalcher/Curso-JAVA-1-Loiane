package aula17.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que leia um nome de usuário e a sua senha e não
		 * aceite a senha igual ao nome do usuário, mostrando uma mensagem de
		 * erro e voltando a pedir as informações.
		 */

		Scanner leitor = new Scanner(System.in);

		boolean valido = true;
		String nome = "";
		String senha = "";

		do {
			System.out.println("Entre com Login");
			nome = leitor.next();
			System.out.println("Entre com a Senha");
			senha = leitor.next();
			if(nome.equalsIgnoreCase(senha)){
				System.out.println("Senha não Pode ser igual ao login");
				
			}else{
				System.out.println("Senha e Login OK");
				valido = false;
			}
		} while(valido);

	}

}
