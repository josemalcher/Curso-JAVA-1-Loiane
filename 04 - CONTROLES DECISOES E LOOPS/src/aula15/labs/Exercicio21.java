package aula15.labs;

import java.util.Scanner;

public class Exercicio21 {
	/*
	 * 21. Um posto est� vendendo combust�veis com a seguinte tabela de
	 * descontos: . �lcool: a. at� 20 litros, desconto de 3% por litro b. acima
	 * de 20 litros, desconto de 5% por litro Gasolina: c. at� 20 litros,
	 * desconto de 4% por litro d. acima de 20 litros, desconto de 6% por litro
	 * Escreva um algoritmo que leia o n�mero de litros vendidos, o tipo de
	 * combust�vel (codificado da seguinte forma: A-�lcool, Ggasolina), calcule
	 * e imprima o valor a ser pago pelo cliente sabendo-se que o pre�o do litro
	 * da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a quantidade de litros");
		double litros = leitor.nextDouble();

		System.out.println("Quao o tipo de Combustivel: A(�lcool) - G(Gasolina) ");
		String tipoCombustivel = leitor.next();

		double precoGasolina = 2.5;
		double precoAlcool = 1.9;

		double percentualDesconto = 0;
		double total = 0;
		double totalDeconto = 0;

		if (tipoCombustivel.equalsIgnoreCase("a")) {
			if (litros > 20) {
				percentualDesconto = 0.03;
			} else {
				percentualDesconto = 0.05;
			}
			total = litros * precoAlcool;
		} else if (tipoCombustivel.equalsIgnoreCase("g")) {
			if (litros > 20) {
				percentualDesconto = 0.04;
			} else {
				percentualDesconto = 0.06;
			}
			total = litros * precoGasolina;
		}
		totalDeconto = total * percentualDesconto;
		
		double precoPAGAR = total - totalDeconto;
		
		System.out.println("Pre�o FInal R$ " + precoPAGAR);

	}
}
