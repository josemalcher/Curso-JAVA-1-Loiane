package aula24.labs;

public class Exerc06 {
	/*
	 * 6. Crie uma classe que represente um contato da agenda do seu celular.
	 */
	public static void main(String[] args) {
		Contato contato1 = new Contato();
		contato1.nome = "jose";
		contato1.endereco = "Av. qualquer";
		contato1.email = "jose@email.com";

		contato1.telefones = new String[5];
		contato1.telefones[0] = "99999-9999";
		contato1.telefones[1] = "99999-9998";
		contato1.telefones[2] = "99999-9997";
		
		//impressões... etc..
	}
}
