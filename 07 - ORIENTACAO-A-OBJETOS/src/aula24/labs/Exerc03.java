package aula24.labs;

public class Exerc03 {
	/*
	 * 3. Usando o resultado do exerc�cio anterior como base, crie uma classe
	 * �LivroDeLivraria� que represente os dados b�sicos de um livro que est� �
	 * venda em uma livraria.
	 */

	public static void main(String[] args) {
		
		LivroLivraria livroJAVA = new LivroLivraria();
		
		livroJAVA.nome = "JAVA Como programar";
		livroJAVA.autor = "DEITEL";
		livroJAVA.preco = 356.5;
		livroJAVA.quantidadeEstoque = 500;
		
		System.out.println("NOME " + livroJAVA.nome);
		System.out.println("Pre�o R$" + livroJAVA.preco);
	}
}
