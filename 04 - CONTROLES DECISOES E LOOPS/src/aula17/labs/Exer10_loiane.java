package aula17.labs;

import java.util.Scanner;

public class Exer10_loiane {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numerp");
		int numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numero2 = leitor.nextInt();
		
		for (int i = numero1 ; i <= numero2 ; i++){
			System.out.println(i);
		}

	}//fala ao inverter os valores!!

}
