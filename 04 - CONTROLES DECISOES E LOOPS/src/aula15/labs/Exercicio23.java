package aula15.labs;

import java.util.Scanner;

public class Exercicio23 {
	/*
	 * 23. O Hipermercado Tabajara está com uma promoção de carnes que é
	 * imperdível. Confira: o Até 5 Kg Acima de 5 Kg o File Duplo R$ 4,90 por Kg
	 * R$ 5,80 por Kg o Alcatra R$ 5,90 por Kg R$ 6,80 por Kg o Picanha R$ 6,90
	 * por Kg R$ 7,80 por Kg Para atender a todos os clientes, cada cliente
	 * poderá levar apenas um dos tipos de carne da promoção, porém não há
	 * limites para a quantidade de carne por cliente. Se compra for feita no
	 * cartão Tabajara o cliente receberá ainda um desconto de 5% sobre o total
	 * a compra. Escreva um programa que peça o tipo e a quantidade de carne
	 * comprada pelo usuário e gere um cupom fiscal, contendo as informações da
	 * compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor
	 * do desconto e valor a pagar.
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Enre com o tipo de carne");
		System.out.println(" 1 - File duplo");
		System.out.println(" 2 - Alcatra ");
		System.out.println(" 3 - Picanha");
		
		int tipo = leitor.nextInt();
		
		System.out.println("Entre com  quantidade (kg) ");
		double quantidadeCarne = leitor.nextDouble();
		
		double precoKg = 0;
		
		if(tipo == 1){
			System.out.println(quantidadeCarne+" KG de file duplo");
			if(quantidadeCarne < 5){
				precoKg = 4.9;
			}else{
				precoKg = 5.8;
			}
		}else if(tipo == 2){
			System.out.println(quantidadeCarne+" KG de ALCATRA");
			if(quantidadeCarne < 5){
				precoKg = 5.9;
			}else{
				precoKg = 6.8;
			}
		}else if(tipo == 3){
			System.out.println(quantidadeCarne+" KG de PICANHA");
			if(quantidadeCarne < 5){
				precoKg = 6.9;
			}else{
				precoKg = 7.8;
			}
		}
		
		double total = quantidadeCarne * precoKg;
		System.out.println(quantidadeCarne + " Kg Preço por quilo R$" + precoKg + " = " + total);
		
		System.out.println("Compra com CARTÃO? Digite 1 para sim ");
		int cartao = leitor.nextInt();
		
		if(cartao == 1 ){
			double desconto = (total/100)* 5;
			System.out.println("Desconto de R$ " + desconto);
			System.out.println("Valor a PAGAR R$ " + (total - desconto));
		}else{
			System.out.println("valor a PAGAR R$"+ total);
		}
		
	}

}
