package aula15.labs;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		// 9. Fa�a um Programa que leia tr�s n�meros e mostre-os em ordem
		// decrescente.

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o primeiro Numero");
		int numero1 = leitor.nextInt();
		System.out.println("Digite o Segundo Numero");
		int numero2 = leitor.nextInt();
		System.out.println("Digite o Terceiro Numero");
		int numero3 = leitor.nextInt();
		if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3) {
			// numero1 � menor
			// numero3 � maior
			// numero1 < numero2 < numero3
			System.out.println(numero3 + " - " + numero2 + " - " + numero1);

		} else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2) {
			// numero1 � menor
			// numero2 � maior
			// numero1 < numero3 < numero2
			System.out.println(numero2 + " - " + numero3 + " - " + numero1);

		} else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3) {
			// numero2 � menor
			// numero3 � maior
			// numero2 < numero1 < numero3
			System.out.println(numero3 + " - " + numero1 + " - " + numero2);

		} else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1) {
			// numero2 � menor
			// numero1 � maior
			// numero2 < numero3 < numero1
			System.out.println(numero1 + " - " + numero3 + " - " + numero2);

		} else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2) {
			// numero3 � menor
			// numero2 � maior
			// numero3 < numero1 < numero2
			System.out.println(numero2 + " - " + numero1 + " - " + numero3);

		} else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1) {
			// numero3 � menor
			// numero1 � maior
			// numero3 < numero2 < numero1
			System.out.println(numero1 + " - " + numero2 + " - " + numero3);

		}

	}

}
