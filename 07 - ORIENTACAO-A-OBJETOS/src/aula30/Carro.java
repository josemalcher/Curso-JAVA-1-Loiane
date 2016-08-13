package aula30;

public class Carro {

	String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	double consumoCombustivel;
	
	Carro(){}

	public Carro(String marca, String modelo, int numeroPassageiros, double capacidadeCombustivel,
			double consumoCombustivel) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		this.capacidadeCombustivel = capacidadeCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		
		
	}

	public Carro(String marca, String modelo, int numeroPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numeroPassageiros = numeroPassageiros;
		System.out.println("Chamando o modelo com 3 parametros");
	}

	public Carro(String marca, String modelo) {
		this(marca,modelo,10);
		System.out.println("Chamando o contrutor com 2 parametros");
	}
	
	void exibirAutonomia(){
		
		System.out.println("A autonomia do carro é " + this.capacidadeCombustivel * this.consumoCombustivel + " KM ");
		
	}
	
	double obterAutonomia(){
		System.out.println("método obter foi chamado");
		return this.capacidadeCombustivel * this.consumoCombustivel;
	}
	
	double calculaCombustivel(double km){
		double quantidadeCombustivel = km / this.consumoCombustivel;
		return quantidadeCombustivel;
	}
	
	
	
	
	
	
}
