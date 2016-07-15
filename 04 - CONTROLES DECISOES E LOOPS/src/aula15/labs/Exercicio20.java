package aula15.labs;

import java.util.Scanner;

public class Exercicio20 {
	/*
	 * 20. Faça um programa que faça 5 perguntas para uma pessoa sobre um crime.
	 * As perguntas são: . "Telefonou para a vítima?" a.
	 * "Esteve no local do crime?" b. "Mora perto da vítima?" c.
	 * "Devia para a vítima?" d. "Já trabalhou com a vítima?" O programa deve no
	 * final emitir uma classificação sobre a participação da pessoa no crime.
	 * Se a pessoa responder positivamente a 2 questões ela deve ser
	 * classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
	 * "Assassino". Caso contrário, ele será classificado como "Inocente".
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Telefonou para a Vítima?");
		String respostas1 = leitor.next();

		System.out.println("Esteve no local do Crime?");
		String respostas2 = leitor.next();

		System.out.println("Mora perto da Vítima?");
		String respostas3 = leitor.next();

		System.out.println("Já trabalhou com a Vítima?");
		String respostas4 = leitor.next();

		System.out.println("Devia Dinheiro para a Vítima?");
		String respostas5 = leitor.next();

		int contador = 0;

		if (respostas1.equalsIgnoreCase("s")){
			contador++;
		}
		if (respostas2.equalsIgnoreCase("s")){
			contador++;
		}
		if (respostas3.equalsIgnoreCase("s")){
			contador++;
		}
		if (respostas4.equalsIgnoreCase("s")){
			contador++;
		}
		if (respostas5.equalsIgnoreCase("s")){
			contador++;
		}

		if (contador == 2) {
			System.out.println("SUSPEITO");
		} else if (contador == 3 || contador == 4) {
			System.out.println("Cúmplice");
		} else if (contador == 5) {
			System.out.println("ASSASSINO!!!");
		} else if (contador == 0) {
			System.out.println("INOCENTE!");
		}

	}
}
