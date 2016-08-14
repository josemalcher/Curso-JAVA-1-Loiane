package aula31;

public class Carro {
	public String marca;
	String modelo;
	int numeroPassageiros;
	double capacidadeCombustivel;
	private double consumoCombustivel;
	
	public void exibirAutonomia(){
		System.out.println(" A autonomia do carro �: " + this.capacidadeCombustivel * this.consumoCombustivel + " KM ");
	}
	
	public double obterAutonomia(){
		
		System.out.println("M�todo obterAutonomia foi chamado");
		return this.capacidadeCombustivel * this.consumoCombustivel;
		
	}
	
	private double divideKmPorConsumoCombustivel(double km){
		
		return km / this.consumoCombustivel;
		
	}
	
	public double calcularCombustivel(double km){
		return this.divideKmPorConsumoCombustivel(km);
	}
	
}
