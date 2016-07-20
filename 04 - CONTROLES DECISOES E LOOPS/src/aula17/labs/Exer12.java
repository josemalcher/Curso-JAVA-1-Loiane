package aula17.labs;

import java.util.Scanner;

public class Exer12 {
	/*
	 * Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
	 * n�mero inteiro entre 1 a 10. O usu�rio deve informar de qual numero ele
	 * deseja ver a tabuada. A sa�da deve ser conforme o exemplo abaixo: o
	 * Tabuada de 5: 
 		5 X 1 = 5 
 		o 5 X 2 = 10 
 		o ... 
 		o 5 X 10 = 50
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite qual tabuada ?");
		int numero = leitor.nextInt();
		
		for(int i=0; i<=10; i++){
			System.out.println(numero + " x "+ i + " = "+numero * i);
		}
	}
	
}
