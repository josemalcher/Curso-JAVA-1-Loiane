package aula17.labs;

import java.util.Scanner;

public class Exer22 {
	/*
	 * 22. Fa�a um programa que calcule o valor total investido por um
	 * colecionador em sua cole��o de CDs e o valor m�dio gasto em cada um
	 * deles. O usu�rio dever� informar a quantidade de CDs e o valor para em
	 * cada um.
	 */

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qual a quantidade de CD's "); 
		int cds = leitor.nextInt();
		 
		 
		 double preco;
		 double soma = 0 ;
		 
		 for(int i=1; i<=cds ; i++){
			 System.out.println("Informa o valor do CD R$ "+i);
			 preco = leitor.nextDouble();
			 soma += preco;	
		 }
		 double media = soma/cds;
		 System.out.println("A m�dia gasta com cada cd �:"+media);
	}
}
