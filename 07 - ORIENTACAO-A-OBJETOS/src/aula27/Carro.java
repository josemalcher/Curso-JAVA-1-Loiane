package aula27;

public class Carro {
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " km");
	}

	double obterAutonomia() {
		System.out.println("Método obter foi chamado!!");
		return capCombustivel * consumoCombustivel;
	}

	// aula 27
	double calcularCombutivel(double km) {
		double qtdCombustivel = km/consumoCombustivel;
		return qtdCombustivel;
	}

}
