package aula39;

public class Professor extends Pessoa{
	
	private double salario;
	private String nomeCurso;
	
	//M�todos
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
