package aula17.labs;

import java.util.Scanner;

public class Exer03 {
	/*
	 * 3 - Faça um programa que leia e valide as seguintes informações: a. Nome:
	 * maior que 3 caracteres; b. Idade: entre 0 e 150; c. Salário: maior que
	 * zero; d. Sexo: 'f' ou 'm'; e. Estado Civil: 's', 'c', 'v', 'd';
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		String sexo;
		String estado;
		
		boolean validador = true;
		do {
			System.out.println("Digite seu nome");
			nome = leitor.next();
			if (nome.length() < 3) {
				System.out.println("Digite um nome maios que 3 digitos");
				validador = true;
			}else{
				validador = false;
			}
		} while (validador);

		validador = true;
		do{
			System.out.println("Digite sua idade");
			idade = leitor.nextInt();
			if(!(idade > 0 && idade < 150)){
				System.out.println("Digite uma idade válida!");
				validador = true;
			}
			else{
				validador = false;
			}
		}while(validador);
		
		validador = true;
		do{
			System.out.println("Digite seu salario");
			salario = leitor.nextDouble();
			if(!(salario > 0)){
				System.out.println("Salário Inválido");
				validador = true;
			}else{
				validador = false;
			}
		}while (validador);
		
		validador = true;
		do{
			System.out.println("Sexo: M ou F");
			sexo = leitor.next();
			if(!(sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f"))){
				System.out.println("Digite 'M' Para masculino ou 'F' para feminino");
				validador = true;
			}else{
				validador = false;
			}
		}while(validador);
		
		validador = true;
		do{
			System.out.println("Estado Cívil: S, C , V, D");
			estado = leitor.next();
			if(!(estado.equalsIgnoreCase("s") || estado.equalsIgnoreCase("v") || estado.equalsIgnoreCase("c") || estado.equalsIgnoreCase("d"))){
				System.out.println("Opção desconhecida!");
				validador = true;
			}else{
				estado = estado.toLowerCase();
				validador = false;
			}
		}while(validador);
		
		System.out.println("***************************");
		System.out.println("Dados:");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: R$ "+salario);
		if(sexo.equalsIgnoreCase("m")){
			System.out.println("Sexo Masculino");
		}else{
			System.out.println("Sexo Feminio");
		}
		switch (estado) {
		case "s": System.out.println("Solteiro(a)");	break;
		case "v": System.out.println("Viúvo(a)");	break;
		case "c": System.out.println("Casado(a)");	break;
		case "d": System.out.println("Divorciado(a)");	break;

		default: System.out.println("Indefinido");
			break;
		}
		System.out.println("***************************");
		
		
	}
}
