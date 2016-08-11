package aula24.labs;

public class Exerc02 {
	/*
	 * 2. Crie uma classe Livro que represente os dados básicos de um livro, sem
	 * se preocupar com a sua finalidade.
	 */
	public static void main(String[] args) {
		
		Livro livroObjeto = new Livro();
		
		livroObjeto.nome = "Nome do livro";
		livroObjeto.autor = "Autor desconhecido";
		livroObjeto.anoLacamento = 1999;
		
		System.out.println("Nome " + livroObjeto.nome);
		System.out.println("Ano Lançamento ; "+ livroObjeto.anoLacamento);
		System.out.println("ISBN " +  livroObjeto.isbn);
	}
}
