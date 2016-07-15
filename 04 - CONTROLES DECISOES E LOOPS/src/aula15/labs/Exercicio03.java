package aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com uma letra, M ou F ");
		String letra = leitor.next();
		
		if(letra.equalsIgnoreCase("f")){
			System.out.println("F - feminino");
		}else if(letra.equalsIgnoreCase("m")){
			System.out.println("M - masculino");
		}else{
			System.out.println("Sexto inválido");
		}

	}

}
