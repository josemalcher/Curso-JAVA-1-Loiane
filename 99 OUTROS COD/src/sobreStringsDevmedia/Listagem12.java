package sobreStringsDevmedia;

public class Listagem12 {
	/*
	 * Método substring
	 * 
	 * Permite extrair substrings de strings e fornece 2 métodos substring para
	 * permitir que um novo objeto seja criado copiando parte de um objeto
	 * string existente. Cada método retorna um novo objeto desse tipo. Neste
	 * método existem duas versões desse método que são:
	 * 
	 * 1ª versão – aceita um argumento inteiro, esse número especifica o índice
	 * inicial na string especificada, a partir da qual os caracteres devem ser
	 * copiados. A substring retornada contém uma cópia dos caracteres desde o
	 * índice inicial até o final da string.
	 * 
	 * 2ª versão – aceita dois argumentos do tipo inteiro – o índice inicial a
	 * partir do qual copia os caracteres da string original e o índice um a
	 * mais além do último caractere que será copiado (copiar até, mas não
	 * incluindo, esse índice na String). A substring retornada contém uma cópia
	 * dos caracteres especificados da string original.
	 * 
	 * Listagem 12: Exemplo do método substring
	 */

	public static void main(String[] args) {
		String nome = "José Malcher";
		System.out.println("String: "+nome);
		
		String substring = nome.substring(5);
		System.out.println("String depois da 3º index "+ "["+ substring + "]");
		
		substring = nome.substring(1, 5);
		System.out.println("Substring (1,6) "+ "["+ substring + "]");
	}

}
