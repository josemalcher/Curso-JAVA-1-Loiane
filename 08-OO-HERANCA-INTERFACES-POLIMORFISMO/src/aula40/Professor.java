package aula40;

public class Professor extends Pessoa{
	
	private double salario;
	private String nomeCurso;
	
	
	//METODOS SObreescritos
	public String obterEtiquetaEndereco(){
		String s = "Endereço do Professor: ";
		s += getEndereco();
		return s;
				
		//return endereco;
	}
	
	
	//Métodos
	public double calcularSalarioLiquido(){
		return 0;
	}
	
	
	//****GETs SETs

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	
}
