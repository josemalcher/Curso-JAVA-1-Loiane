package aula17.labs;

import java.util.Scanner;

public class Exer30 {
	/*
	 * 30. Desenvolva um programa que fa�a a tabuada de um n�mero qualquer
	 * inteiro que ser� digitado pelo usu�rio, mas a tabuada n�o deve
	 * necessariamente iniciar em 1 e terminar em 10, o valor inicial e final
	 * devem ser informados tamb�m pelo usu�rio, conforme exemplo abaixo:
	 * o Montar a tabuada de: 5
	 * o Come�ar por: 4
o Terminar em: 7
o
o Vou montar a tabuada de 5 come�ando em 4 e terminando em 7:
o 5 X 4 = 20
o 5 X 5 = 25
o 5 X 6 = 30
o 5 X 7 = 35

Obs: Voc� deve verificar se o usu�rio n�o digitou o final menor
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
		System.out.println("Come�a por "+ numeroInicio);
		System.out.println("Termina por "+ numeroFinal);
		System.out.println();
		
		for(int i=numeroInicio ; i <= numeroFinal ; i++){
			System.out.println(numero + " x " + i + " = " + (numero * i));
		}
		
		
		
	}
	
}
