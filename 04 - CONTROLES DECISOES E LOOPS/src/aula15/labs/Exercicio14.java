package aula15.labs;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		/*
		 * 14. Faça um programa que lê as duas notas parciais obtidas por um
		 * aluno numa disciplina ao longo de um semestre, e calcule a sua média.
		 * A atribuição de conceitos obedece à tabela abaixo: o Média de
		 * Aproveitamento | Conceito o Entre 9.0 e 10.0 A o Entre 7.5 e 9.0 B o
		 * Entre 6.0 e 7.5 C o Entre 4.0 e 6.0 D o Entre 4.0 e zero E O
		 * algoritmo deve mostrar na tela as notas, a média, o conceito
		 * correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou
		 * “REPROVADO” se o conceito for D ou E.
		 */

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a primeira nota");
		double nota01 = leitor.nextDouble();

		System.out.println("Digite a segunda nota");
		double nota02 = leitor.nextDouble();

		double mediaNotas = (nota01 + nota02) / 2;
		System.out.println("Média das Notas = " + mediaNotas);

		String conceitoNota = "";
		if (mediaNotas <= 4.0) {
			conceitoNota = "E";
		} else if (mediaNotas > 4.0 && mediaNotas <= 6.0) {
			conceitoNota = "D";
		} else if (mediaNotas > 6.0 && mediaNotas <= 7.5) {
			conceitoNota = "C";
		} else if (mediaNotas > 7.5 && mediaNotas <= 9.0) {
			conceitoNota = "B";
		} else if (mediaNotas > 9.0 && mediaNotas <= 10.0) {
			conceitoNota = "A";
		} else {
			System.out.println("Nota inválida! SOmente valores Double");
		}
		
		System.out.println("Média : " + conceitoNota);
		
		switch (conceitoNota) {
		case "A":
		case "B":
		case "C":
			System.out.println("Aprovado");
			break;
		case "D":
		case "E":
			System.out.println("Reprovado");
			break;
		}

	}
}
