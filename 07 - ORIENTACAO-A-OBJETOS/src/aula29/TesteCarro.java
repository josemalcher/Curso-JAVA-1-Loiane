package aula29;

public class TesteCarro {
	public static void main(String[] args) {
		
		Carro santana = new Carro();
		santana.marca = "Santana";
		santana.modelo = "QUadrado";
		//..
		
		System.out.println(santana.marca);
		
		System.out.println("**********");
		
		Carro2 carroMolode = new Carro2("Santana", "Quadrado", 5, 200, 5);
		
		System.out.println(carroMolode.marca);
		System.out.println(carroMolode.modelo);
		
	}
}
