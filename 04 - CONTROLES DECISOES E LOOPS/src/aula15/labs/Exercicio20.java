package aula15.labs;

import java.util.Scanner;

public class Exercicio20 {
	/*
	 * 20. Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime.
	 * As perguntas s�o: . "Telefonou para a v�tima?" a.
	 * "Esteve no local do crime?" b. "Mora perto da v�tima?" c.
	 * "Devia para a v�tima?" d. "J� trabalhou com a v�tima?" O programa deve no
	 * final emitir uma classifica��o sobre a participa��o da pessoa no crime.
	 * Se a pessoa responder positivamente a 2 quest�es ela deve ser
	 * classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como
	 * "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
	 */
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);

		System.out.println("Telefonou para a V�tima?");
		String respostas1 = leitor.next();

		System.out.println("Esteve no local do Crime?");
		String respostas2 = leitor.next();

		System.out.println("Mora perto da V�tima?");
		String respostas3 = leitor.next();

		System.out.println("J� trabalhou com a V�tima?");
		String respostas4 = leitor.next();

		System.out.println("Devia Dinheiro para a V�tima?");
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
			System.out.println("C�mplice");
		} else if (contador == 5) {
			System.out.println("ASSASSINO!!!");
		} else if (contador == 0) {
			System.out.println("INOCENTE!");
		}

	}
}
