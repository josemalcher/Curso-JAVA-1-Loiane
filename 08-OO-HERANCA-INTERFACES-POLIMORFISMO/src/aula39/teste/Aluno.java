package aula39.teste;

import aula39.Pessoa;

public class Aluno extends Pessoa{

private String curso;
private double[] notas;

//*****************
//TESTES DE ACESSO

public void verificarAcesso(){
	this.nomeVisibilidade = "protected";
	super.nomeVisibilidade = "com super";
}


//*****************

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
