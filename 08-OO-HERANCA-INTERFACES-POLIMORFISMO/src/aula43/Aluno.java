package aula43;

import java.util.Arrays;

public class Aluno {

private String curso;
private double[] notas;

//toString
@Override
public String toString() {
	return "Aluno [curso=" + curso + 
			", notas=" + 
			Arrays.toString(notas) + "]";
}

//equals gerado pelo eclipse
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Aluno other = (Aluno) obj;
	if (curso == null) {
		if (other.curso != null)
			return false;
	} else if (!curso.equals(other.curso))
		return false;
	if (!Arrays.equals(notas, other.notas))
		return false;
	return true;
}

//equals -> LOIANE
/*
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	
	Aluno other = (Aluno) obj;
	
	//compara��o apenas no NOME DO CURSO
	if (curso.equalsIgnoreCase(other.getCurso())){
		return true;
	}
	
	return false;
}
*/


//METODOS SObreescritos
public String obterEtiquetaEndereco(){
	String s = "Endere�o do ALuno: ";
	//s += getEndereco();
	return s;
			
	//return endereco;
}





//Construtores
public Aluno() {
	super();
}

public Aluno(String nome, String endereco, String telefone, String curso) {
	//super(nome, endereco, telefone);
	this.curso = curso;
}



//M�todos
public double calcularMedia(){
	return 0;
}

public boolean verificarAprovado(){
	return true;
}

public void metodoQualquer(){
	//super.setCpf("123");
	
	//this.setCpf("123");
}

//@Override
public void imprimirEtiquetaEndereco() {
	System.out.println(this.obterEtiquetaEndereco());
	
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
