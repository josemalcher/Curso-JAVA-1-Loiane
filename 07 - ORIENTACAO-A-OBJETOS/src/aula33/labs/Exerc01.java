package aula33.labs;

public class Exerc01 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exerc�cios, criando todos os atributos do tipo
	 * privado, m�todos getters e setters e construtores. Os m�todos que ser�o
	 * utilizados pela classe de teste devem ser p�blicos. Se necess�rio, crie
	 * m�todos privados como auxiliares para organizar melhor o c�digo fonte
	 * tamb�m.
	 * 
	 * 1. Escreva uma classe para representar uma l�mpada. Desenvolva m�todos
	 * para ligar, desligar a lampada.
	 * 
	 */

	public static void main(String[] args) {
		Lampada lampada01 = new Lampada();
		
		lampada01.ligar();
		lampada01.mostrarEstado();
		
		lampada01.desligar();
		lampada01.mostrarEstado();
	}
}
