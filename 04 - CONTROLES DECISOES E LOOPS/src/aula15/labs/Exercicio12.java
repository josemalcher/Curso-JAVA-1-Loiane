package aula15.labs;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*12. Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
		o Desconto do IR:
		o Salário Bruto até 900 (inclusive) - isento
		o Salário Bruto até 1500 (inclusive) - desconto de 5%
		o Salário Bruto até 2500 (inclusive) - desconto de 10%
		o Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.*/

		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite o Valor da Sua Hora Trabalhada");
		double valorHora = leitor.nextDouble();
		
		System.out.println("Digite a quantidade de Horas Trabalhadas");
		double horaTrabalhada = leitor.nextDouble();
		
		double valorBruto = valorHora * horaTrabalhada;
		
		double SINDICATO = 0.03;
		double FGTS = 0.11;
		double INSS = 0.10;
		
		double LIMITEisento = 900;
		double LIMITEpequeno = 1500;
		double LIMITEmedio = 2500;
		
		System.out.println("O Salario Bruto é R$ " + valorBruto ); //Salário bruto
		
		double totalDescontoSindicato = valorBruto * SINDICATO;
		System.out.println("( )Valor Transferido para o Sindicato R$ "+ totalDescontoSindicato); //valor transferido ao Sindicato
		
		if(valorBruto <= LIMITEisento){
			//System.out.println("ISENTO de Pagamento de IR");
			System.out.println("(-) IR (5%) R$ " + "ISENTO"); //Desconto Imposto de Renda
			
			double totalINSS = valorBruto * INSS;
			System.out.println("(-) INSS (10%) R$ " + totalINSS);//Desconto INSS
			
			double totalFGTS = valorBruto * FGTS;
			System.out.println("( ) FGTS (11%) R$" + totalFGTS ); //FGTS
			
			double totalDESCONTOS = totalINSS ;
			System.out.println("(-) Total de Descontos R$ " + totalDESCONTOS ); //valor total dos descontos
			
			double totalSalarioLIQUIDO = valorBruto - totalDESCONTOS;
			System.out.println("Salário Liquido R$ "+ totalSalarioLIQUIDO); // Salário Líquido
		}else if(valorBruto > LIMITEisento && valorBruto <= LIMITEpequeno){
			//System.out.println("Deconto de 5% IR");
			double totalIR = valorBruto * 0.05;
			System.out.println("(-) IR (5%) R$ " + totalIR); //Desconto Imposto de Renda
			
			double totalINSS = valorBruto * INSS;
			System.out.println("(-) INSS (10%) R$ " + totalINSS);//Desconto INSS
			
			double totalFGTS = valorBruto * FGTS;
			System.out.println("( ) FGTS (11%) R$" + totalFGTS ); //FGTS
			
			double totalDESCONTOS = totalINSS  + totalIR;
			System.out.println("(-) Total de Descontos R$ " + totalDESCONTOS ); //valor total dos descontos
			
			double totalSalarioLIQUIDO = valorBruto - totalDESCONTOS;
			System.out.println("Salário Liquido R$ "+ totalSalarioLIQUIDO); // Salário Líquido
		}else if(valorBruto > LIMITEpequeno && valorBruto <= LIMITEmedio){
			//System.out.println("Desconto de 10% IR");
			double totalIR = valorBruto * 0.10;
			System.out.println("(-) IR (5%) R$ " + totalIR); //Desconto Imposto de Renda
			
			double totalINSS = valorBruto * INSS;
			System.out.println("(-) INSS (10%) R$ " + totalINSS);//Desconto INSS
			
			double totalFGTS = valorBruto * FGTS;
			System.out.println("( ) FGTS (11%) R$" + totalFGTS ); //FGTS
			
			double totalDESCONTOS = totalINSS  + totalIR;
			System.out.println("(-) Total de Descontos R$ " + totalDESCONTOS ); //valor total dos descontos
			
			double totalSalarioLIQUIDO = valorBruto - totalDESCONTOS;
			System.out.println("Salário Liquido R$ "+ totalSalarioLIQUIDO); // Salário Líquido
		}else if(valorBruto > LIMITEmedio){
			//System.out.println("Desconto de 20% IR");
			double totalIR = valorBruto * 0.20;
			System.out.println("(-) IR (5%) R$ " + totalIR); //Desconto Imposto de Renda
			
			double totalINSS = valorBruto * INSS;
			System.out.println("(-) INSS (10%) R$ " + totalINSS);//Desconto INSS
			
			double totalFGTS = valorBruto * FGTS;
			System.out.println("( ) FGTS (11%) R$" + totalFGTS ); //FGTS
			
			double totalDESCONTOS = totalINSS + totalIR;
			System.out.println("(-) Total de Descontos R$ " + totalDESCONTOS ); //valor total dos descontos
			
			double totalSalarioLIQUIDO = valorBruto - totalDESCONTOS;
			System.out.println("Salário Liquido R$ "+ totalSalarioLIQUIDO); // Salário Líquido
		}
		
		
		
		
		
		

	}

}
