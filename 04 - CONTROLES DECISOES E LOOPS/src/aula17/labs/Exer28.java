package aula17.labs;

import java.util.Scanner;

public class Exer28 {
	/*
	 * 28. Os n�meros primos possuem v�rias aplica��es dentro da Computa��o, por
	 * exemplo na Criptografia. Um n�mero primo � aquele que � divis�vel apenas
	 * por um e por ele mesmo. Fa�a um programa que pe�a um n�mero inteiro e
	 * determine se ele � ou n�o um n�mero primo.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero para verificar");
		int numero = leitor.nextInt();
		
		boolean primo = true;
		
		for( int i = 2 ; i < numero; i++){
			if(numero % i == 0){
				System.out.println("N�o � primo - divisil por " + i);
				primo = false;
			}
		}
		if(primo){
			System.out.println("� numeor primo");
		}
		
	}
}
