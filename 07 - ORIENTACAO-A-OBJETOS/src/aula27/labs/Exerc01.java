package aula27.labs;

public class Exerc01 {
	/*
	 * 1. Escreva uma classe para representar uma l�mpada. Desenvolva m�todos
	 * para ligar, desligar a lampada.
	 */
	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.ligar();
		lampada.mostraEstado();
		
		lampada.desligar();
		lampada.mostraEstado();
		
		lampada.mudarEstado();
		lampada.mostraEstado();
	}
}
