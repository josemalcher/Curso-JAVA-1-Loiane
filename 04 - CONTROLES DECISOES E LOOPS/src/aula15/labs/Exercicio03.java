package aula15.labs;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// 3. Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com uma letra, M ou F ");
		String letra = leitor.next();
		
		if(letra.equalsIgnoreCase("f")){
			System.out.println("F - feminino");
		}else if(letra.equalsIgnoreCase("m")){
			System.out.println("M - masculino");
		}else{
			System.out.println("Sexto inv�lido");
		}

	}

}
