package aula17.labs;

import java.util.Scanner;

public class Exer18 {
	/*
	 * 18. Fa�a um programa que pe�a um n�mero inteiro e determine se ele � ou
	 * n�o um n�mero primo. Um n�mero primo � aquele que � divis�vel somente por
	 * ele mesmo e por 1.
	 */
	//resolu��o loiane + 

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero");
		
		int numero = leitor.nextInt();
		
		boolean primo = true;
		
		for(int i= 2 ; i < numero; i++ ){
			if(numero % i == 0){
				System.out.println("N�o � primo - � divisivel por: "+ i);
				primo = false;
			}
		}
		
		if(primo){
			System.out.println("� Primo: "+numero);
		}
		
		
		
		
	}
}
