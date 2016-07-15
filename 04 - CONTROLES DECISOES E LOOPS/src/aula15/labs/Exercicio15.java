package aula15.labs;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		/*
		 * 15. Faça um Programa que peça os 3 lados de um triângulo. O programa
		 * deverá informar se os valores podem ser um triângulo. Indique, caso
		 * os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
		 * escaleno. o Dicas: o Três lados formam um triângulo quando a soma de
		 * quaisquer dois lados for maior que o terceiro; o Triângulo
		 * Equilátero: três lados iguais; o Triângulo Isósceles: quaisquer dois
		 * lados iguais; o Triângulo Escaleno: três lados diferentes;
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
			// verifica se é Equilatero
			if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
				System.out.println("É um triangulo Equilatero");
			} else
			// verifica se é escaleno
			if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
				System.out.println("É um Triangulo Escaleno");
			} else
			// verifica se é isosceles
			if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
				System.out.println("É um Triangulo Isósceles");
			}
		} else {
			System.out.println("Não é um Triangulo!!!");
		}

	}
}
