package aula14;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
/*		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com a sua idade");
		int idade = leitor.nextInt();
		if (idade >= 18){
			System.out.println("É maior de idade");
			
		}else{
			System.out.println("É menor de idade");
		}
			
		String idade = JOptionPane.showInputDialog("Digite sua idade");
		
		if(Integer.parseInt(idade)>=18){
			JOptionPane.showMessageDialog(null, "É de maior!");
		}else{
			JOptionPane.showMessageDialog(null, "É de MENOR!!");
		}
*/		
		// Exemplo 02
		/*
		 * Barato <= 10
		 * 10 < valor < 15 - pedir desconto
		 * 15 <= valor 17 - pesquisar mais
		 *  >= 17 - muito caro
		 */
		Scanner leitorTeclado = new Scanner(System.in);
		
		System.out.println("Entre com o valor, ");
		double valor = leitorTeclado.nextDouble();
		
		if(valor <= 10){
			System.out.println("Está barato, pode comprar");
		}else if(valor > 10 && valor < 15){
			System.out.println("Pedir desconto!!");
		}else if(valor >=15 && valor < 17){
			System.out.println("Pode pesquisar mais");
		}else{ //valor >= 17
			System.out.println("Muito caro, desistir!");
		}
		
		
		

	}

}
