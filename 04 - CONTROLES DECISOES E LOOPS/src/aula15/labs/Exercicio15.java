package aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		/*
		 * 15. Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa
		 * dever� informar se os valores podem ser um tri�ngulo. Indique, caso
		 * os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou
		 * escaleno. o Dicas: o Tr�s lados formam um tri�ngulo quando a soma de
		 * quaisquer dois lados for maior que o terceiro; o Tri�ngulo
		 * Equil�tero: tr�s lados iguais; o Tri�ngulo Is�sceles: quaisquer dois
		 * lados iguais; o Tri�ngulo Escaleno: tr�s lados diferentes;
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o Lado 1 do Triangulo");
		double lado1 = leitor.nextDouble();

		System.out.println("Digite o Lado 2 do Triangulo");
		double lado2 = leitor.nextDouble();

		System.out.println("Digite o Lado 3 do Triangulo");
		double lado3 = leitor.nextDouble();

		// verifica se e triangulo
// ((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) ||((lado2 + lado3) > lado1)
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) ||((lado2 + lado3) > lado1)) {
			// verifica se � Equilatero
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("� um triangulo Equilatero");
			} else
			// verifica se � escaleno
			if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("� um Triangulo Escaleno");
			} else
			// verifica se � isosceles
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("� um Triangulo Is�sceles");
			}
		} else {
			System.out.println("N�o � um Triangulo!!!");
		}

	}
}
