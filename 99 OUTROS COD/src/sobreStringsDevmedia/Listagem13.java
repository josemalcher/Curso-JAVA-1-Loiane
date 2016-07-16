package sobreStringsDevmedia;

public class Listagem13 {
	/*
	 * Método replace
	 * 
	 * Retorna um novo objeto contendo a string original com um trecho
	 * especificado substituído por outra expressão indicada. Esse método deixa
	 * a string original inalterada. A versão sobrecarregada do método replace
	 * permite substituir substrings em vez de caracteres individuais.
	 * 
	 * Listagem 13: Exemplo do método replace
	 */
	public static void main(String[] args) {
		String nome = "mesquita";
		String nomeAlterado = nome.replace('e', 'o');
		
		System.out.println(nomeAlterado);
	}
}
