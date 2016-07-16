package sobreStringsDevmedia;

public class Listagem13 {
	/*
	 * M�todo replace
	 * 
	 * Retorna um novo objeto contendo a string original com um trecho
	 * especificado substitu�do por outra express�o indicada. Esse m�todo deixa
	 * a string original inalterada. A vers�o sobrecarregada do m�todo replace
	 * permite substituir substrings em vez de caracteres individuais.
	 * 
	 * Listagem 13: Exemplo do m�todo replace
	 */
	public static void main(String[] args) {
		String nome = "mesquita";
		String nomeAlterado = nome.replace('e', 'o');
		
		System.out.println(nomeAlterado);
	}
}
