package aula17.labs;

import java.util.Scanner;

public class Exer13_loiane {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a base");
		int base = leitor.nextInt();
		
		System.out.println("Digite a Expoente");
		int expoente = leitor.nextInt();
		
		int potencia = base;
		
		for(int i=1; i< expoente ; i++){
			potencia *= base;
		}
		
		//Todo número elevado a zero é igual a 1 com exceção do zero. 
		// http://www.vivendoentresimbolos.com/2012/10/potenciacao.html
		
		System.out.println("Resultado "+potencia);

	}

}
