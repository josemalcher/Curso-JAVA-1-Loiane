package aula15.labs;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
/* 5. Fa�a um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
	o A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
	o A mensagem "Reprovado", se a m�dia for menor do que sete;
	o A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.
*/
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com a primeira Nota");
		double nota1 = leitor.nextDouble();
		
		System.out.println("Entre com a segunda Nota");
		double nota2 = leitor.nextDouble();
		
		double media = (nota1+nota2)/2;
		System.out.println("A m�dia das Notas � = " + media );
		
		if(media == 10){
			System.out.println("APROVADO, Nota 10");
		}else if(media < 7){
			System.out.println("REPROVADO!!");
		}else{
			System.out.println("APROVADO!");
		}
		
	}

}
