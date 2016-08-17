package aula34.labs;

public class Exerc02 {
	/*
	 * 2. Escreva uma classe Calculadora que tenha os seguintes métodos: somar,
	 * subtrair, multiplicar, dividir (dois números), elevar à potência n.
	 * Desenvolva um programa para testar essa classe.
	 */
	
	static void imprimirTela(int num){
		System.out.println(num);
	}
	static void imprimirTela(double num){
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		
		int soma = Calculadora.soma(1, 10);
		System.out.println(soma);
		
		imprimirTela(Calculadora.dividir(55, 10));
	
		
		
	}
	
}
