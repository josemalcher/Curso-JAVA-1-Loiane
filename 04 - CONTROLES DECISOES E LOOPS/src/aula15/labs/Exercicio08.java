package aula15.labs;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// 8. Fa�a um programa que pergunte o pre�o de tr�s produtos e
		// informe qual produto voc� deve comprar, sabendo que a decis�o �
		// sempre pelo mais barato.

		Scanner leitor = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero");
		double preco1 = leitor.nextDouble();

		System.out.println("Entre com o segundo valor");
		double preco2 = leitor.nextDouble();

		System.out.println("Entre com o terceiro Valor");
		double preco3 = leitor.nextDouble();

		if (preco1 <= preco2 && preco1 <= preco3) {
			System.out.println("Compre o produto 1");
		} else if (preco2 <= preco1 && preco2 <= preco3) {
			System.out.println("Compre o produto 2");
		} else if (preco3 <= preco1 && preco3 <= preco2) {
			System.out.println("Compre o produto 3");
		}
	}

}
