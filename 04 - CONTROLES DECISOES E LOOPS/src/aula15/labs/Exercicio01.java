package aula15.labs;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		// 1. Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro Valor");
		int numero1 = leitor.nextInt();
		System.out.println("Digite o Segundo Valor");
		int numero2 = leitor.nextInt();
		
		if(numero1 > numero2){
			System.out.println("O PRIMEIRO VALOR � MAIOR");
		}else{
			System.out.println("O SEGUNDO VALOR � MAIOR");
		}
	}
}
