package aula42;

public class Professor {
	
	private double salario;
	private String nomeCurso;
	
	
	//METODOS SObreescritos
	public String obterEtiquetaEndereco(){
		String s = "Endereço do Professor: ";
		//s += getEndereco();
		return s;
				
		//return endereco;
	}
	
	//@Override
	public void imprimirEtiquetaEndereco() {
		System.out.println("Imprimindo endereço do Professor");
		System.out.println(this.obterEtiquetaEndereco());
		
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
