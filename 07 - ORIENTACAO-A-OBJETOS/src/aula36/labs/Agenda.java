package aula36.labs;

public class Agenda {
	private String nome;
	private Contato[] contatos;

	// funções
	public String obterInfo() {
		String info = "Nome " + nome + " \n";

		if (contatos != null) {
			for (Contato contato : contatos) {
				info += contato.obterInfo() + "\n";
			}
		}
		return info;
	}

	// Métodos gets e sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}

}
