package aula17.labs;

import java.util.Scanner;

public class Exer30 {
	/*
	 * 30. Desenvolva um programa que faça a tabuada de um número qualquer
	 * inteiro que será digitado pelo usuário, mas a tabuada não deve
	 * necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
	 * devem ser informados também pelo usuário, conforme exemplo abaixo:
	 * o Montar a tabuada de: 5
	 * o Começar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 começando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35

Obs: Você deve verificar se o usuário não digitou o final menor
que o inicial.

	 * 
	 */
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre como o numero para gerar a tabuada");
		int numero = leitor.nextInt();
		
		boolean invalido = true;
		int numeroFinal, numeroInicio;
		
		do{
			System.out.println("Entre com o inicio da tabuada");
			numeroInicio = leitor.nextInt();
			
			System.out.println("Entre com o numero Final");
			numeroFinal = leitor.nextInt();
			
			if(numeroFinal > numeroInicio){
				invalido = false;
			}
		}while(invalido);
		
		System.out.println("Tabauda de "+ numero );
		System.out.println("Começa por "+ numeroInicio);
		System.out.println("Termina por "+ numeroFinal);
		System.out.println();
		
		for(int i=numeroInicio ; i <= numeroFinal ; i++){
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
		
		
	}
	
}
