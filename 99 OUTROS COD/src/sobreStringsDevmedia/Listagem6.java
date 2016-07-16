package sobreStringsDevmedia;

public class Listagem6 {
	/*
	 * M�todos de Compara��o
	 * 
	 * A classe String fornece v�rios m�todos para comparar strings. Quando �
	 * realizada uma compara��o entre strings, o compilador compara os n�meros
	 * dos caracteres das partes, pois cada letra � representada por um n�mero.
	 * As compara��es com o operador de igualdade (==) servem para comparar
	 * valores de tipos primitivos, o resultado � verdadeiro true se ambos os
	 * valores forem id�nticos. Se as refer�ncias forem comparadas com sinal de
	 * igualdade (==), o resultado ser� verdadeiro (true) se as duas refer�ncias
	 * indicam o mesmo objeto na mem�ria.
	 * 
	 * Listagem 6: Exemplo de atribui��o de refer�ncias
	 */

	public static void main(String[] args) {
		String a = new String("ab");
		String b = a;
		
		if(a == b){
			System.out.println("A e B S�o iguais");
		}
	}
}
