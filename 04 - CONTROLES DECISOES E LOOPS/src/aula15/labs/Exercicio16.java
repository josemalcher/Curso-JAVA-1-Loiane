package aula15.labs;

import java.util.Scanner;

public class Exercicio16 {
	/*
	 * 16. Faça um programa que calcule as raízes de uma equação do segundo
	 * grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a, b e
	 * c e fazer as consistências, informando ao usuário nas seguintes
	 * situações: a. Se o usuário informar o valor de A igual a zero, a equação
	 * não é do segundo grau e o programa não deve fazer pedir os demais
	 * valores, sendo encerrado; b. Se o delta calculado for negativo, a equação
	 * não possui raizes reais. Informe ao usuário e encerre o programa; c. Se o
	 * delta calculado for igual a zero a equação possui apenas uma raiz real;
	 * informe-a ao usuário; d. Se o delta for positivo, a equação possui duas
	 * raiz reais; informe-as ao usuário;
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valode de A ");
		int valorA = leitor.nextInt();
		if (valorA == 0) {
			System.out.println("Não é uma equação do segundo GRAU");
		} else {
			System.out.println("Digite o valode de B ");
			int valorB = leitor.nextInt();
			System.out.println("Digite o valode de C ");
			int valorC = leitor.nextInt();
			
			double delta = (valorB * valorB) - (4 * valorA * valorC);
			if (delta < 0 ){
				System.out.println("Delta é Negativo!!");
			}else{
				System.out.println("Valo de delta é " + delta);
				
				double valorX1 = ((-valorB)+ Math.sqrt(delta)) / (2 * valorA);
				double valorX2 = ((-valorB)- Math.sqrt(delta)) / (2 * valorA);
				
				System.out.println("Valor de X1 = "+ valorX1);
				System.out.println("Valor de X2 = "+ valorX2);
				
			}
		}

	}
}
