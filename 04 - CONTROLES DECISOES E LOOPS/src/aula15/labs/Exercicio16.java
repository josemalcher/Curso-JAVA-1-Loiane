package aula15.labs;

import java.util.Scanner;

public class Exercicio16 {
	/*
	 * 16. Fa�a um programa que calcule as ra�zes de uma equa��o do segundo
	 * grau, na forma ax2 + bx + c. O programa dever� pedir os valores de a, b e
	 * c e fazer as consist�ncias, informando ao usu�rio nas seguintes
	 * situa��es: a. Se o usu�rio informar o valor de A igual a zero, a equa��o
	 * n�o � do segundo grau e o programa n�o deve fazer pedir os demais
	 * valores, sendo encerrado; b. Se o delta calculado for negativo, a equa��o
	 * n�o possui raizes reais. Informe ao usu�rio e encerre o programa; c. Se o
	 * delta calculado for igual a zero a equa��o possui apenas uma raiz real;
	 * informe-a ao usu�rio; d. Se o delta for positivo, a equa��o possui duas
	 * raiz reais; informe-as ao usu�rio;
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite o valode de A ");
		int valorA = leitor.nextInt();
		if (valorA == 0) {
			System.out.println("N�o � uma equa��o do segundo GRAU");
		} else {
			System.out.println("Digite o valode de B ");
			int valorB = leitor.nextInt();
			System.out.println("Digite o valode de C ");
			int valorC = leitor.nextInt();
			
			double delta = (valorB * valorB) - (4 * valorA * valorC);
			if (delta < 0 ){
				System.out.println("Delta � Negativo!!");
			}else{
				System.out.println("Valo de delta � " + delta);
				
				double valorX1 = ((-valorB)+ Math.sqrt(delta)) / (2 * valorA);
				double valorX2 = ((-valorB)- Math.sqrt(delta)) / (2 * valorA);
				
				System.out.println("Valor de X1 = "+ valorX1);
				System.out.println("Valor de X2 = "+ valorX2);
				
			}
		}

	}
}
