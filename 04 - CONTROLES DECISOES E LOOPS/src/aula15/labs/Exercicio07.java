package aula15.labs;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// 7. Faça um Programa que leia três números e mostre o maior e o menor deles.
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro Numero");
		int numero1 = leitor.nextInt();
		System.out.println("Digite o Segundo Numero");
		int numero2 = leitor.nextInt();
		System.out.println("Digite o Terceiro Numero");
		int numero3 = leitor.nextInt();
		
		if(numero1 >= numero2 && numero1 >= numero3){
			System.out.println("Numero 1 é maior");
		}else if(numero2 >= numero1 && numero2 >= numero3){
			System.out.println("NUmero 2 é maior");
		}else if(numero3 >= numero1 && numero3 >= numero2){
			System.out.println("Numero 3 é maior");
		}
		if(numero1 <= numero2 && numero1 <= numero3){
			System.out.println("Numero 1 é Menor");
		}else if(numero2 <= numero1 && numero2 <= numero3){
			System.out.println("NUmero 2 é Menor");
		}else if(numero3 <= numero1 && numero3 <= numero2){
			System.out.println("Numero 3 é Menor");
		}
		
		
	}

}
