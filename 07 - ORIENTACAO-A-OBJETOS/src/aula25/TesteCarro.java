package aula25;

import aula25.Carro;

public class TesteCarro {
	public static void main(String[] args) {
		Carro fiat = new Carro();
		fiat.marca = "Fiat";
		fiat.modelo = "Sedan";
		fiat.numPassageiros = 4;
		fiat.capCombustivel = 200;
		fiat.consumoCombustivel = 5.5;

		System.out.println(fiat.marca);
		
		fiat.exibirAutonomia();
	}
}
