package aula17.labs;

import java.util.Scanner;

public class Exer20 {
	/*
	 * 20. Fa�a um programa que pe�a para n pessoas a sua idade, ao final o
	 * programa devera verificar se a m�dia de idade da turma varia entre 0 e
	 * 25,26 e 60 e maior que 60; e ent�o, dizer se a turma � jovem, adulta ou
	 * idosa, conforme a m�dia calculada.
	 */
	//loiane

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantida de idades");
		int idades = leitor.nextInt();
		
		int idade;
		int soma = 0;
		
		for( int i = 0; i < idades; i ++){
			System.out.println("Digite a idade da pessoa "+ (i + 1));
			idade = leitor.nextInt();
			
			soma += idade;
		}
		
		double media = soma / idades;
		
		System.out.println("M�dia = " + media);
		
		if(media >= 0 && media <=25){
			System.out.println("jovem");
		}else if(media >= 26 && media <= 60){
			System.out.println("Adulta");
		}else if(media > 60){
			System.out.println("idosa");
		}
		
		
		
	}

}
