package aula15.labs; 

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. As Organizações Tabajara resolveram dar um aumento de salário aos
		 * seus colaboradores e lhe contraram para desenvolver o programa que
		 * calculará os reajustes. o Faça um programa que recebe o salário de um
		 * colaborador e o reajuste segundo o seguinte critério, baseado no
		 * salário atual: o salários até R$ 280,00 (incluindo) : aumento de 20%
		 * o salários entre R$ 280,00 e R$ 700,00 : aumento de 15% o salários
		 * entre R$ 700,00 e R$ 1500,00 : aumento de 10% o salários de R$
		 * 1500,00 em diante : aumento de 5% Após o aumento ser realizado,
		 * informe na tela: o o salário antes do reajuste; o o percentual de
		 * aumento aplicado; o o valor do aumento; o o novo salário, após o
		 * aumento.
		 */

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o salario do FUncionario");
		double salarioFuncionario = leitor.nextDouble();

		double aumento01 = 0.20;
		double aumento02 = 0.15;
		double aumento03 = 0.10;
		double aumento04 = 0.05;

		if (salarioFuncionario <= 280.00) {
			double aumento = salarioFuncionario * aumento01;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento01);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total é R$ " + salarioFinal);
		} else if (salarioFuncionario > 280.00 && salarioFuncionario < 700.00) {
			double aumento = salarioFuncionario * aumento02;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento02);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total é R$ " + salarioFinal);

		}else if (salarioFuncionario >= 700.00 && salarioFuncionario < 1500.00) {
			double aumento = salarioFuncionario * aumento03;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento03);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total é R$ " + salarioFinal);

		}else if (salarioFuncionario >= 1500.00) {
			double aumento = salarioFuncionario * aumento04;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento04);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total é R$ " + salarioFinal);

		}
	}

}
