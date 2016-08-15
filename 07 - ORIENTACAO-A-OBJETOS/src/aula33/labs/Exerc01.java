package aula33.labs;

public class Exerc01 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exercícios, criando todos os atributos do tipo
	 * privado, métodos getters e setters e construtores. Os métodos que serão
	 * utilizados pela classe de teste devem ser públicos. Se necessário, crie
	 * métodos privados como auxiliares para organizar melhor o código fonte
	 * também.
	 * 
	 * 1. Escreva uma classe para representar uma lâmpada. Desenvolva métodos
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
