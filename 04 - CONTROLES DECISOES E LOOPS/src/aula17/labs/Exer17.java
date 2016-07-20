package aula17.labs;
import java.util.Scanner;

public class Exer17 {
	/*
	 * Faça um programa que calcule o fatorial de um número inteiro fornecido
	 * pelo usuário. Ex.: 5!=5.4.3.2.1=120
	 */
	//resolução Loiane com ajustes

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero : ");
		int numero = leitor.nextInt();
		
		System.out.print(numero + "! = ");
		
		int fatorial = 1;
		for (int i=numero; i>0; i--){
			fatorial *= i;
			System.out.printf("%s ",i);
		}
		System.out.println("\nResultado = "+ fatorial);
		
		
		
		
	}

}
