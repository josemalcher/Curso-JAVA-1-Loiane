package aula17.labs;
import java.util.Scanner;

public class Exer17 {
	/*
	 * Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido
	 * pelo usu�rio. Ex.: 5!=5.4.3.2.1=120
	 */
	//resolu��o Loiane com ajustes

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
