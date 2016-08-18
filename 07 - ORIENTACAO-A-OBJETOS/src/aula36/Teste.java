package aula36;

public class Teste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Jose Malcher");

		// relacionamento TEM - UM endereço
		Endereco endereco = new Endereco();
		endereco.setNomeRua("Rua angelo custodio");
		endereco.setCidade("Belem");
		endereco.setEstado("PA");
		endereco.setNumero("123");
		endereco.setCep("6620-000");

		contato.setEndereco(endereco);

		// relacionamento TEM - UM telefone

		Telefone telefone = new Telefone();
		telefone.setNumero("123456789");
		telefone.setTipo("Casa");
		telefone.setDdd("91");

		Telefone telefone2 = new Telefone();
		telefone2.setNumero("999999999");
		telefone2.setTipo("Celular");
		telefone2.setDdd("91");

		Telefone[] telefones = new Telefone[2];
		telefones[0] = telefone;
		telefones[1] = telefone2;

		contato.setTelefones(telefones);

		// TESTES no CONSOLE
		System.out.println("NOME " + contato.getNome());

		// verificando se contao == null
		if (contato != null && contato.getEndereco() != null) {
			System.out.println(contato.getEndereco().getCidade());
		}
		
		// 1 - *  ( um para muitos)
		if(contato != null && contato.getTelefones() != null){
			for(Telefone tel : telefones){
				System.out.println(tel.getDdd() + " - " + tel.getNumero());
			}
		}
		
		

	}
}
