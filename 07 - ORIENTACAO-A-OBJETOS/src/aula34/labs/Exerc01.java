package aula34.labs;

public class Exerc01 {
	/*
	 * 1. Escreva uma classe chamada Contador, que tem um atributo est�tico que
	 * � incrementado sempre que a classe for instanciada. Crie m�todos para
	 * zerar, incrementar e retornar o valor do contador. Desenvolva um programa
	 * para testar essa classe.
	 */
	
	static void imprimirValor(){
		System.out.println(Contador.obterValor());
	}
	
	public static void main(String[] args) {
		imprimirValor();
		
		Contador.incrementar();
		
		imprimirValor();
		
		Contador.incrementar();
		Contador.incrementar();
		Contador.incrementar();
		
		imprimirValor();
		
	}
}
