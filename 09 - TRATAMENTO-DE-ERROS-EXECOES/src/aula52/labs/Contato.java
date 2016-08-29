package aula52.labs;

public class Contato {
	
	private static int contador;
	
	private int id;
	private String nome;
	private String telefone;
	private String email;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	/*	public void setId(int id) {
		this.id = id;
	}*/

	//contrutor
	public Contato() {
		contador++;
		id = contador;
	}
	@Override
	public String toString() {
		
		String s =  " [ "
				  + "Id = " + id 
				  + "| Nome = " + nome 
				  + "| Telefone = " + telefone 
				  + "| Email = " + email + " ] ";
		
		return s;
	}
	
	
	
	
}
