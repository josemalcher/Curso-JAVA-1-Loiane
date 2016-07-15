package aula15.labs;

import java.util.Scanner;

public class Exercicio22 {
	/*
	 * 22. Uma fruteira está vendendo frutas com a seguinte tabela de preços:
	 * Até 5 Kg Acima de 5 Kg Morango R$ 2,50 por Kg R$ 2,20 por Kg Maçã R$ 1,80
	 * por Kg R$ 1,50 por Kg Se o cliente comprar mais de 8 Kg em frutas ou o
	 * valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de
	 * 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg)
	 * de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor
	 * a ser pago pelo cliente.
	 */

	public static void main(String[] args) {
		
		/*Scanner leitor = new Scanner(System.in);
		
		System.out.println("QUal a quantidade de KG de Morango ?");
		double quantidadeMorango = leitor.nextDouble();
		
		System.out.println("Qual a quantidade de KG de Maçã");
		double quantidadeMaca = leitor.nextDouble();
		
		double precoMorango = 0;
		if(quantidadeMorango <= 5){
			precoMorango = 2.5;
		}else{
			precoMorango = 2.2;
		}
		
		double precoMaca = 0;
		if(quantidadeMaca <= 5){
			precoMaca = 1.8;
		}else{
			precoMaca = 1.5;
		}
		
		double precoTotalMorango = quantidadeMorango * precoMorango; 
		double precoTotalMaca 	 = quantidadeMaca * precoMaca;
		
		System.out.println("Preço total Morango R$"+ precoTotalMorango);
		System.out.println("Preço total Maçã R$"+ precoTotalMaca);
		
		double precoPARCIAL = precoMaca + precoMorango;
		double precoTOTAL = precoPARCIAL;
		
		if((quantidadeMaca+ quantidadeMorango > 8) || (precoPARCIAL > 25) ){
			precoTOTAL = precoPARCIAL - ((precoPARCIAL /100)*10);
		}
		System.out.println("Preco Total = R$" +precoTOTAL);
		
		*/
		
		  Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Entre com a quantidade (kg) de morango:");
	        double qtdMorango = scan.nextDouble();
	        
	        System.out.println("Entre com a quantidade (kg) de maça:");
	        double qtdMaca = scan.nextDouble();
	        
	        double precoKgMorango = 0;
	        if (qtdMorango <= 5){
	           precoKgMorango =  2.5;
	        } else {
	            precoKgMorango =  2.2;
	        }
	        
	        double precoKgMaca = 0;
	        if (qtdMaca <= 5){
	            precoKgMaca = 1.8;
	        } else {
	            precoKgMaca = 1.5;
	        }
	        
	        double precoTotalMorango = qtdMorango * precoKgMorango;
	        double precoTotalMaca = qtdMaca * precoKgMaca;
	        
	        double precoParcial = precoKgMorango + precoKgMaca;
	        double precoTotal = precoParcial;
	        
	        if ((qtdMorango + qtdMaca > 8) || precoParcial > 25){
	            precoTotal = precoParcial - ((precoParcial / 100) * 10);
	        }
	        
	        System.out.println("Preco total = " + precoTotal);
		
	}

}
