package aula17.labs;

import java.util.Scanner;

public class Exer32 {
/*
 * 32. O card�pio de uma lanchonete � o seguinte:
 * o Especifica��o C�digo Pre�o
o Cachorro Quente 100 R$ 1,20
o Bauru Simples 101 R$ 1,30
o Bauru com ovo 102 R$ 1,50
o Hamb�rguer 103 R$ 1,20
o Cheeseburguer 104 R$ 1,30
o Refrigerante 105 R$ 1,00
 * 
 * Fa�a um programa que leia o c�digo dos itens pedidos e as
quantidades desejadas. Calcule e mostre o valor a ser pago por
item (pre�o * quantidade) e o total geral do pedido. Considere
que o cliente deve informar quando o pedido deve ser
encerrado.
 * 
 * Resolu��o Loiane
 */
	
	public static void main(String[] args) {
		/*Scanner leitor = new Scanner(System.in);
		
		boolean naoTerminar = true;
		int codigo, quantidade;
		double total = 0;
		String output = "";
		
		do{
			System.out.println("Entre com o codigo e a quantidade, Digite 0 0  para siar");
			codigo = leitor.nextInt();
			quantidade = leitor.nextInt();
			if(codigo == 0 && quantidade == 0){
				naoTerminar = false;
				output += "Total a pagar = R$ "+ total ; 
			}else{
				if (codigo == 100){
                    output += "Cachorro Quente -> 1,20 * " + quantidade ;
                    output += " = " + (1.2*quantidade) + "\n";
                    total += 1.2*quantidade;
                } else if (codigo == 101){
                    output += "Bauru Simples -> 1,30 * " + quantidade ;
                    output += " = " + (1.3*quantidade) + "\n";
                    total += 1.3*quantidade;
                } else if (codigo == 102){
                    output += "Bauru com ovo -> 1,50 * " + quantidade ;
                    output += " = " + (1.5*quantidade) + "\n";
                    total += 1.5*quantidade;
                } else if (codigo == 103){
                    output += "Hamb�rguer -> 1,20 * " + quantidade ;
                    output += " = " + (1.2*quantidade) + "\n";
                    total += 1.2*quantidade;
                } else if (codigo == 104){
                    output += "Cheeseburguer -> 1,30 * " + quantidade ;
                    output += " = " + (1.3*quantidade) + "\n";
                    total += 1.3*quantidade;
                } else if (codigo == 105){
                    output += "Refrigerante -> 1,00 * " + quantidade ;
                    output += " = " + (1*quantidade) + "\n";
                    total += 1*quantidade;
}
			}
			
			
		}while(naoTerminar);
		
		System.out.println(output);
		*/
		
Scanner scan = new Scanner(System.in);
        
        boolean naoTerminar = true;
        int cod, qtd;
        double total = 0;
        String output = "";
        
        do {
            
            System.out.println("Digite o c�digo e a quantidade. Digite 0 0 para sair.");
            cod = scan.nextInt();
            qtd = scan.nextInt();
            
            if (cod == 0 && qtd == 0){
                naoTerminar = false;
                output += "Total a pagar = " + total;
            } else {
                
                if (cod == 100){
                    output += "Cachorro Quente -> 1,20 * " + qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;
                } else if (cod == 101){
                    output += "Bauru Simples -> 1,30 * " + qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;
                } else if (cod == 102){
                    output += "Bauru com ovo -> 1,50 * " + qtd ;
                    output += " = " + (1.5*qtd) + "\n";
                    total += 1.5*qtd;
                } else if (cod == 103){
                    output += "Hamb�rguer -> 1,20 * " + qtd ;
                    output += " = " + (1.2*qtd) + "\n";
                    total += 1.2*qtd;
                } else if (cod == 104){
                    output += "Cheeseburguer -> 1,30 * " + qtd ;
                    output += " = " + (1.3*qtd) + "\n";
                    total += 1.3*qtd;
                } else if (cod == 105){
                    output += "Refrigerante -> 1,00 * " + qtd ;
                    output += " = " + (1*qtd) + "\n";
                    total += 1*qtd;
                }
            }
            
        }while(naoTerminar);
        
System.out.println(output);
		
		
	}
	
}
