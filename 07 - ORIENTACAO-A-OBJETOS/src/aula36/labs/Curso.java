package aula36.labs;

public class Curso {
private String nome;
private String horario;
private Professor professor;
private Aluno[] alunos;

public String obterInfo(){
	String info = "Nome do curso = " + this.nome + " \n";
	
	if(this.professor != null){
		info += professor.obterInfo();
	}
	
	if(this.alunos != null){
		System.out.println("---ALUNOS---");
		for(Aluno aluno : alunos){
			if(aluno != null){
				info += aluno.obterInfo();
				info += " \n ";
			}
		}
		info += "\n M�dia da turma = " + obterMediaTurma();
	}
		
	return info;
}

public double obterMediaTurma(){
	double soma = 0;
	for(Aluno aluno: alunos){
		if(aluno != null){
			soma += aluno.obterMedia();
		}
	}
	return soma / alunos.length;
}




//******* GETs E SETs
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getHorario() {
	return horario;
}
public void setHorario(String horario) {
	this.horario = horario;
}
public Professor getProfessor() {
	return professor;
}
public void setProfessor(Professor professor) {
	this.professor = professor;
}
public Aluno[] getAlunos() {
	return alunos;
}
public void setAlunos(Aluno[] alunos) {
	this.alunos = alunos;
}




}
