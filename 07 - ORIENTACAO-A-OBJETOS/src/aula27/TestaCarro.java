package aula27;

import aula27.Carro;

public class TestaCarro {
	public static void main(String[] args) {
		Carro fiat = new Carro();
		fiat.marca = "Fiat";
		fiat.modelo = "Sedan";
		fiat.numPassageiros = 4;
		fiat.capCombustivel = 200;
		fiat.consumoCombustivel = 5.5;

		System.out.println(fiat.marca);

		fiat.exibirAutonomia();

		double autonomia = fiat.obterAutonomia();

		System.out.println("Autonomia é = " + autonomia);

		// ou
		System.out.println("Autonomia é = " + fiat.obterAutonomia());
		
		System.out.println("******");
		//aula27
		double qtdCOmbustivel10 = fiat.calcularCombutivel(10);
		double qtdCOmbustivel15 = fiat.calcularCombutivel(15);
		
		System.out.println("Quantidade 10 = " + qtdCOmbustivel10);
		System.out.println("Quantidade 15 = " + qtdCOmbustivel15);

	}
}
