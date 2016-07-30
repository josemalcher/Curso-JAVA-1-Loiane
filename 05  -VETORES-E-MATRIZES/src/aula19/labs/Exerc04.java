package aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc04 {
	/*
	 * 4. Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
	 * mesmo tamanho, sendo que cada elemento do vetor B deverá ser a raiz
	 * quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		double[] vetorA = new double[15];
		double[] vetorB = new double[vetorA.length];

		for (int i = 1; i < vetorA.length; i++) {
			System.out.println("Digite o valores de Vetor A -> Posição = " + i);
			vetorA[i] = leitor.nextDouble();

			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		DecimalFormat formatador = new DecimalFormat("###,###.##");
		
		System.out.print("Valor de A =  ");
		for(int i = 1 ; i < vetorA.length ; i++){
			System.out.print(vetorA[i]);
		}
		System.out.println();
		System.out.print("Valor de B =  ");
		for(int i = 1 ; i < vetorB.length ; i++){
			System.out.print(formatador.format(vetorB[i]));
		}
	}
}
