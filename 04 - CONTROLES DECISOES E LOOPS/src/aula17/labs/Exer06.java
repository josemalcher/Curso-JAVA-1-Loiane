package aula17.labs;

public class Exer06 {
	/*
	 * 7 - Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do
	 * outro. Depois modifique o programa para que ele mostre os n�meros um ao
	 * lado do outro.
	 */
	public static void main(String[] args) {
		int numero = 1;
		
		while(numero <= 20){
			System.out.println(numero);
			numero++;
		}
		numero = 1;
		while(numero <= 20){
			System.out.printf("%s ",numero);
			numero++;
		}
	}
}
