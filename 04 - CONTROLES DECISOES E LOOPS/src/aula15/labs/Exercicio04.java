package aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// 4. Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		// Solução da Loiane!!
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com uma letra");
		String letra = leitor.next();
/*		
		if( letra.equalsIgnoreCase("a") || 
			letra.equalsIgnoreCase("e") || 
			letra.equalsIgnoreCase("i") || 
			letra.equalsIgnoreCase("o") || 
			letra.equalsIgnoreCase("u")){
			System.out.println("É vogal");
		}else{
			System.out.println("É consoante");
		}
		*/
		
		// Outra solução
		if(letra.length() > 1){
			System.out.println("Não é uma letra valida");
		}else{
			switch(letra){
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
			case "A":
			case "E":
			case "I":
			case "O":
			case "U": System.out.println("É Vogal"); break;
			default: System.out.println("E consoante");
			}
		}

	}

}
