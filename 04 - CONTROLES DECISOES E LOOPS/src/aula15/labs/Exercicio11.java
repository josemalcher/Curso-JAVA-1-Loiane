package aula15.labs; 

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos
		 * seus colaboradores e lhe contraram para desenvolver o programa que
		 * calcular� os reajustes. o Fa�a um programa que recebe o sal�rio de um
		 * colaborador e o reajuste segundo o seguinte crit�rio, baseado no
		 * sal�rio atual: o sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
		 * o sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15% o sal�rios
		 * entre R$ 700,00 e R$ 1500,00 : aumento de 10% o sal�rios de R$
		 * 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado,
		 * informe na tela: o o sal�rio antes do reajuste; o o percentual de
		 * aumento aplicado; o o valor do aumento; o o novo sal�rio, ap�s o
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
			System.out.println("Salario total � R$ " + salarioFinal);
		} else if (salarioFuncionario > 280.00 && salarioFuncionario < 700.00) {
			double aumento = salarioFuncionario * aumento02;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento02);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total � R$ " + salarioFinal);

		}else if (salarioFuncionario >= 700.00 && salarioFuncionario < 1500.00) {
			double aumento = salarioFuncionario * aumento03;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento03);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total � R$ " + salarioFinal);

		}else if (salarioFuncionario >= 1500.00) {
			double aumento = salarioFuncionario * aumento04;
			double salarioFinal = salarioFuncionario + aumento;
			System.out.println("Salario Base R$ " + salarioFuncionario);
			System.out.println("Aumento de % " + aumento04);
			System.out.println("Aumento de R$ " + aumento);
			System.out.println("Salario total � R$ " + salarioFinal);

		}
	}

}
