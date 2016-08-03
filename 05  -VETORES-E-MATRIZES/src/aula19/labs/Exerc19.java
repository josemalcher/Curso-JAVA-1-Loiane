package aula19.labs;

import java.util.Scanner;

public class Exerc19 {
	/*
	 * 19. Ler as duas notas bimestrais para um conjunto de 10 alunos. Armazenar
	 * as notas informadas em dois vetores �Nota1� e �Nota2� do tipo real.
	 * Escreva um programa que calcule a m�dia aritm�tica simples das notas
	 * informadas armazenando o resultado em um vetor �Result� de mesmo tipo e
	 * tamanho. Ao mostrar os resultados exibir a situa��o de cada aluno. Se a
	 * m�dia calculada for superior ou igual a 7 o aluno estar� �aprovado�, caso
	 * contr�rio, a situa��o do aluno ser� �reprovado�.
	 * 
	 * Resolu��o Loiane
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double[] vetorNotas1 = new double[10];
		double[] vetorNotas2 = new double[vetorNotas1.length];
		double[] vetorResultados = new double[vetorNotas1.length];
		
		for(int i = 0 ; i < vetorNotas1.length ; i++){
			
			System.out.println("Entre com a nota 1 do aluno " + i );
			vetorNotas1[i] = leitor.nextDouble();
			
			System.out.println("Entre com a nota 2 do aluno "+ i );
			vetorNotas2[i] = leitor.nextDouble();
			
			vetorResultados[i] = (vetorNotas1[i] + vetorNotas2[i]) / 2;
			
		}
		
		System.out.print("Notas 1 = ");
		for(double nota : vetorNotas1){
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		System.out.print("Notas 2 = ");
		for(double nota : vetorNotas2){
			System.out.print(nota + " ");
		}
		
		System.out.println();
		
		for( int i = 0 ; i < vetorResultados.length ; i++){
			if(vetorResultados[i] >= 7){
				System.out.println(vetorResultados[i] + " Aprovato");
			}else{
				System.out.println(vetorResultados[i] + " Reprovado");
			}
		}
		
	}
}
