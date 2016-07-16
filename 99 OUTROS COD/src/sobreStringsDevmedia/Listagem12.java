package sobreStringsDevmedia;

public class Listagem12 {
	/*
	 * M�todo substring
	 * 
	 * Permite extrair substrings de strings e fornece 2 m�todos substring para
	 * permitir que um novo objeto seja criado copiando parte de um objeto
	 * string existente. Cada m�todo retorna um novo objeto desse tipo. Neste
	 * m�todo existem duas vers�es desse m�todo que s�o:
	 * 
	 * 1� vers�o � aceita um argumento inteiro, esse n�mero especifica o �ndice
	 * inicial na string especificada, a partir da qual os caracteres devem ser
	 * copiados. A substring retornada cont�m uma c�pia dos caracteres desde o
	 * �ndice inicial at� o final da string.
	 * 
	 * 2� vers�o � aceita dois argumentos do tipo inteiro � o �ndice inicial a
	 * partir do qual copia os caracteres da string original e o �ndice um a
	 * mais al�m do �ltimo caractere que ser� copiado (copiar at�, mas n�o
	 * incluindo, esse �ndice na String). A substring retornada cont�m uma c�pia
	 * dos caracteres especificados da string original.
	 * 
	 * Listagem 12: Exemplo do m�todo substring
	 */

	public static void main(String[] args) {
		String nome = "Jos� Malcher";
		System.out.println("String: "+nome);
		
		String substring = nome.substring(5);
		System.out.println("String depois da 3� index "+ "["+ substring + "]");
		
		substring = nome.substring(1, 5);
		System.out.println("Substring (1,6) "+ "["+ substring + "]");
	}

}
