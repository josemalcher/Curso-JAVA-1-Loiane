package aula40;

public class Aluno extends Pessoa{

private String curso;
private double[] notas;


//METODOS SObreescritos
public String obterEtiquetaEndereco(){
	String s = "Endereço do ALuno: ";
	s += getEndereco();
	return s;
			
	//return endereco;
}

//Construtores
public Aluno() {
	super();
}

public Aluno(String nome, String endereco, String telefone, String curso) {
	super(nome, endereco, telefone);
	this.curso = curso;
}



//Métodos
public double calcularMedia(){
	return 0;
}

public boolean verificarAprovado(){
	return true;
}

public void metodoQualquer(){
	super.setCpf("123");
	
	this.setCpf("123");
}


//****GETs SETs

public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public double[] getNotas() {
	return notas;
}
public void setNotas(double[] notas) {
	this.notas = notas;
}



}
