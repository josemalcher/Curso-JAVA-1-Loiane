package aula38;

public class Teste {
	public static void main(String[] args) {
		
		Aluno aluno01 = new Aluno();
		
		Professor professor01 = new Professor();
		
		aluno01.setNome("nome na classe Pessoa");
		professor01.setNome("Nome na classe pessoa");
		
		Pessoa aluno02 = new Aluno();
		aluno02.getNome();
		//acima aparece somente dados de Pessoa
		
		
	}
}
