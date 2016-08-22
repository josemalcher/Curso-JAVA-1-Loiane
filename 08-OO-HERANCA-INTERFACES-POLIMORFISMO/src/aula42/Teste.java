package aula42;

public class Teste {

	public static void main(String[] args) {
		/*Pessoa pessoa = new Pessoa();
		Pessoa aluno = new Aluno();
		Pessoa professor = new Professor();*/
		
		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		
		System.out.println(Constantes.URL_BLOG);
		//Constantes.URL_BLOG = "Tentativa de alteração";
		System.out.println(Constantes.URL_BLOG);
		
		final int TOTAL = 1;
		//TOTAL += 1;
		System.out.println(TOTAL);
		
		
		
		//pessoa.setEndereco("Rua 1, n1");
		//aluno.setEndereco("Rua 2, n2");
		//professor.setEndereco("Rua 3, n3");
		
		//System.out.println(pessoa.obterEtiquetaEndereco());
		//System.out.println(aluno.obterEtiquetaEndereco());
		//System.out.println(professor.obterEtiquetaEndereco());

	}

}
