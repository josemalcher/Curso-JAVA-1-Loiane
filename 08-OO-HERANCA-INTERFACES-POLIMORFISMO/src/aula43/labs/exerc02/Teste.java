package aula43.labs.exerc02;

public class Teste {

	/*
	 * Lista de exercícios: Pasta /pdf/
	 * 
	 */
	
	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica1 = new PessoaFisica();
		pessoaFisica1.setNome("Nome Pessoa FIsica 01");
		pessoaFisica1.setRendaBruta(1000);
		pessoaFisica1.setCpf("789.789.789-22");
		
		PessoaJuridica pessoaJuridica1 = new PessoaJuridica();
		pessoaJuridica1.setNome("Nome Pessoa Juridica 01");
		pessoaJuridica1.setCnpj("111.111.111-22");
		pessoaJuridica1.setRendaBruta(5000);
		
		PessoaFisica pessoaFisica2 = new PessoaFisica();
		pessoaFisica2.setNome("Nome Pessoa FIsica 02");
		pessoaFisica2.setRendaBruta(4000);
		pessoaFisica2.setCpf("222.222.222-44");
		
		PessoaJuridica pessoaJuridica2 = new PessoaJuridica();
		pessoaJuridica2.setNome("Nome Pessoa Juridica 02");
		pessoaJuridica2.setCnpj("444.333.222-22");
		pessoaJuridica2.setRendaBruta(2000);
		
		PessoaFisica pessoaFisica3 = new PessoaFisica();
		pessoaFisica3.setNome("Nome Pessoa FIsica 03");
		pessoaFisica3.setRendaBruta(3333);
		pessoaFisica3.setCpf("555.555.444-22");
		
		PessoaJuridica pessoaJuridica3 = new PessoaJuridica();
		pessoaJuridica3.setNome("Nome Pessoa Juridica 03");
		pessoaJuridica3.setCnpj("333.333.222-22");
		pessoaJuridica3.setRendaBruta(5500);
		
		Contribuinte[] contribuintes = new Contribuinte[6];
		contribuintes[0] = pessoaFisica1;
		contribuintes[1] = pessoaFisica2; 
		contribuintes[2] = pessoaFisica3; 
		contribuintes[3] = pessoaJuridica1; 
		contribuintes[4] = pessoaJuridica2; 
		contribuintes[5] = pessoaJuridica3;
		
		for(Contribuinte contribuinte : contribuintes){
			System.out.println(contribuinte.toString());
		}
		
		
	}
	
	
	
	
}
