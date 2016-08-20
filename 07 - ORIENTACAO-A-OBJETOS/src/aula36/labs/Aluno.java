package aula36.labs;

public class Aluno {
	private String nome;
	private String matricula;
	private double[] notas;
	
	public String obterInfo(){
		String info = "Nome Aluno = " + this.nome + " ; ";
		info += "Matricula =" + this.matricula + " ;";
		info += "Notas : ";
		
		double soma = 0;
		for (double nota : notas){
			soma += nota;
			info += nota + " ";
		}
		double media = soma / 4;
		info += " \n " + "M�dia = " + media + " - ";
		if(media >= 7){
			info += "APROVADO!!" ; 
		}else{
			info += "Reprovado...";
		}
		
		return info;
	}
	
	public double obterMedia(){
		double soma = 0;
		for(double nota: notas){
			soma += nota;
		}
		return soma/4;
	}
	
	
	
	//*****GETs SETs
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double[] getNotas() {
		return notas;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	
	
	
	
	
}
