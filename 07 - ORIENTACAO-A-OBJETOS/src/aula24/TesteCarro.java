package aula24;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro fiat = new Carro();
		fiat.marcaCarro = "Fiat";
		fiat.modeloCarro = "Sedan";
		fiat.numeroPassageiros = 4;
		fiat.capacidadeCombustivel = 100;
		fiat.consumoCombustivel = 5.5;
		
		System.out.println(fiat.marcaCarro);
		System.out.println(fiat.modeloCarro);
		
		Carro santana = new Carro();
		santana.marcaCarro = "Santana";
		santana.modeloCarro = "Sedan Luxo!";
		santana.numeroPassageiros = 6;
		santana.capacidadeCombustivel = 200;
		santana.consumoCombustivel = 1.5;
		
		System.out.println(santana.marcaCarro);
		System.out.println(santana.modeloCarro);
		
	}
}
