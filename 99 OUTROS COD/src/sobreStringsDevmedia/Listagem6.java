package sobreStringsDevmedia;

public class Listagem6 {
	/*
	 * Métodos de Comparação
	 * 
	 * A classe String fornece vários métodos para comparar strings. Quando é
	 * realizada uma comparação entre strings, o compilador compara os números
	 * dos caracteres das partes, pois cada letra é representada por um número.
	 * As comparações com o operador de igualdade (==) servem para comparar
	 * valores de tipos primitivos, o resultado é verdadeiro true se ambos os
	 * valores forem idênticos. Se as referências forem comparadas com sinal de
	 * igualdade (==), o resultado será verdadeiro (true) se as duas referências
	 * indicam o mesmo objeto na memória.
	 * 
	 * Listagem 6: Exemplo de atribuição de referências
	 */

	public static void main(String[] args) {
		String a = new String("ab");
		String b = a;
		
		if(a == b){
			System.out.println("A e B São iguais");
		}
	}
}
