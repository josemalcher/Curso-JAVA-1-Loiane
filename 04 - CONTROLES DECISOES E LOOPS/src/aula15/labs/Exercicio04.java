package aula15.labs;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// 4. Fa�a um Programa que verifique se uma letra digitada � vogal ou consoante.
		// Solu��o da Loiane!!
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com uma letra");
		String letra = leitor.next();
/*		
		if( letra.equalsIgnoreCase("a") || 
			letra.equalsIgnoreCase("e") || 
			letra.equalsIgnoreCase("i") || 
			letra.equalsIgnoreCase("o") || 
			letra.equalsIgnoreCase("u")){
			System.out.println("� vogal");
		}else{
			System.out.println("� consoante");
		}
		*/
		
		// Outra solu��o
		if(letra.length() > 1){
			System.out.println("N�o � uma letra valida");
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
			case "U": System.out.println("� Vogal"); break;
			default: System.out.println("E consoante");
			}
		}

	}

}
