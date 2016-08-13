package aula29;

public class Carro {
	
	String marca;
	String modelo;
	int numeroPassageiro;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro(){
		System.out.println("Classe Carro() foi instanciada");
		numeroPassageiro = 4;
	}
	
	Carro(String marca_, String modelo_, int numeroPassageitos_, double capacidadeCombustivel_, double consumiCombustivel_){
		marca = marca_;
		modelo = modelo_;
		capacidadeCombustivel = capacidadeCombustivel_;
		numeroPassageiro = numeroPassageitos_;
		consumoCombustivel = consumiCombustivel_;
	}
	
	void exevirAutonome(){
		System.out.println("A autonomia do carro é: " + capacidadeCombustivel * consumoCombustivel + " KM");
	}
	
	double obterAutonomia(){
		System.out.println("Método obter autonomia doi chamado");
		return capacidadeCombustivel * consumoCombustivel;
	}
	
	double calcularComubstivel(double km){
		double quantidadeCombustivel = km/consumoCombustivel;
		return quantidadeCombustivel;
	}
}
