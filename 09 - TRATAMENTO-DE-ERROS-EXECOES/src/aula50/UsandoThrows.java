package aula50;

import java.util.Scanner;

public class UsandoThrows {
	public static void main(String[] args) {

		System.out.println("Entre com um número decimal");
		try {
			double num = leNumero();
			System.out.println("Você digitou " + num);
		} catch (Exception e) {
			System.out.println("Entrada inválida");
			//usar somente em logs
			e.printStackTrace();
		}

	}

	public static double leNumero() throws Exception {
		Scanner leitor = new Scanner(System.in);
		double num = leitor.nextDouble();
		return num;
	}
}
