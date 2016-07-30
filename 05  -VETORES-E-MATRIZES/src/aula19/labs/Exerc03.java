package aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc03 {

	public static void main(String[] args) {
		/*
		 * 3. Criar um vetor A com 15 elementos inteiros. Construir um vetor B
		 * de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
		 * ser o quadrado do respectivo elemento de A, ou seja: B[i] = A[i] *
		 * A[I].
		 */
		
		Scanner leitor  = new Scanner(System.in);
		
		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i = 0; i < vetorA.length ; i++){
			System.out.println("Digite 15 inteitos "+ i);
			vetorA[i] = leitor.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		System.out.print("Vetor A ->");
		for(int vetor : vetorA){
			System.out.print(vetor + " ");
		}
		System.out.println();
		
		DecimalFormat formatador = new DecimalFormat("###,###.##");
		
		System.out.print("Vetor B ->");
		for(double vetor : vetorB){
			System.out.print(formatador.format(vetor) + " ");
		}

	}

}
