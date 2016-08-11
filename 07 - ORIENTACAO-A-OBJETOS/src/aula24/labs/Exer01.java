package aula24.labs;

public class Exer01 {
	/*
	 * 1. Escreva uma classe para representar uma lâmpada que está à venda em um
	 * supermercado.
	 */
	
	public static void main(String[] args) {
		
		Lampada lampTipo1 = new Lampada();
		
		lampTipo1.modelo = "A01";
		lampTipo1.tensao = "Bivolt";
		lampTipo1.cor = "Branca";
		//etc...
		
		//Atenção especial aqui:
		lampTipo1.tipos = new String[5];
		lampTipo1.tipos[0] = "Para Abajur";
		lampTipo1.tipos[1] = "Carro";
	}
	
}
