package aula17.labs;

import java.util.Scanner;

public class Exer11 {
	/*
	 * 11 - Altere o programa anterior para mostrar no final a soma dos números.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o primeiro numero inteiro");
		int numero1 = leitor.nextInt();

		System.out.println("Digite o segundo numero inteiro");
		int numero2 = leitor.nextInt();
		
		int soma = 0;
		if (numero1 < numero2) {
			for (int i = (numero1 + 1) ; i < numero2; i++) {
				System.out.println(i);
				soma += i;
			}
			System.out.println("A soma é = "+soma);
		} else if (numero1 > numero2) {
			for (int i = (numero2 + 1); i < numero1; i++) {
				System.out.println(i);
				soma += i;
			}
			System.out.println("A soma é = "+soma);
		} else {
			System.out.println("Número são iguais!!!");
		}
		
	}
}
