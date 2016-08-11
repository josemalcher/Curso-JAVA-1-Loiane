package aula24.labs;

import java.util.Date;

public class Exerc04 {
	/*
	 * 4. Usando o resultado do modelo “Livro” como base, crie uma classe
	 * “LivroDeBiblioteca” que represente os dados básicos de um livro de uma
	 * biblioteca, que pode ser emprestado a leitores.
	 */
	public static void main(String[] args) {
		LivroBiblioteca livroEmprestimo = new LivroBiblioteca();
		
		livroEmprestimo.nome = "Livro Qualquer";
		livroEmprestimo.autor = "Autor qualquer";
		
		livroEmprestimo.empretado = true;
		
		livroEmprestimo.dataEntrega = new Date();
		livroEmprestimo.nomeUsuario = "Jose";
		
		System.out.println("Nome " + livroEmprestimo.nome);
		//etc...etc...
		
		
	}
}
