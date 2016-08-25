package aula43.labs.exerc03;

public class Mamifero extends Animal {
	private String alimento;

	public Mamifero() {
		super();
		this.setCor("Castanho");
		this.setAmbiente("Terrra");
		this.alimento = "mel";
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	@Override
	public String toString() {
		return "Mamifero [alimento=" + alimento + 
				",\n toString()=" + super.toString() + "]";
	}
	
	
	
	
}
