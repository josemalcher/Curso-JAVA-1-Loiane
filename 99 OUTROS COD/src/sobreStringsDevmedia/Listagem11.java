package sobreStringsDevmedia;

public class Listagem11 {
	/*
	 * indexOf
	 * 
	 * Localiza a primeira ocorr�ncia de um caractere em uma string. Se o m�todo
	 * localizar o caractere, � retornado o �ndice do caractere na String, caso
	 * contr�rio retorna -1. Existem duas vers�es do indexOf que procuram
	 * caracterers em uma String.
	 * 
	 * 1� vers�o � aceita um inteiro que � conhecido como o n�mero do �ndice na
	 * String. 2� vers�o � aceita dois argumentos inteiros � o caractere e o
	 * �ndice inicial em que a pesquisa da String deve iniciar.
	 * 
	 * lastIndexOf
	 * 
	 * Localiza a �ltima ocorr�ncia de um caractere em uma string. O m�todo
	 * procura do fim da string em dire��o ao come�o, se encontrar o caractere �
	 * retornado o seu �ndice na string, caso contr�rio retorna -1. Existem duas
	 * vers�es do lastIndexOf que pesquisam por caracteres em uma string.
	 * 
	 * 1� vers�o � utiliza um inteiro do caractere. 2� vers�o � aceita 2
	 * argumentos � um inteiro de caractere e o �ndice a partir do qual iniciar
	 * a pesquisa de tr�s para frente.
	 * 
	 * 
	 * Listagem 11: Exemplo dos m�todos indexOf e lastIndexOf
	 */
	
	public static void main(String[] args) {
		String letras = "abcadefghijklmcopqrsdeftuvz";
		
		//teste indexOf para localizar um caractere em uma String
		System.out.printf("ultimo 'c' esta localizado no index %d \n", letras.indexOf('c'));
		System.out.printf("ultimo 'a' esta localizado no indes %d \n", letras.indexOf('a', 1));
		System.out.println();
		
		// '-1' N�o existe
		System.out.printf("'$' esta localizado no index %d \n\n", letras.indexOf('$'));
		System.out.println();
		
		//Teste lasIndexOf para localizar um caractere em uma String
		System.out.printf("Ultimo 'c' esta localizado no index %d\n", letras.lastIndexOf('c'));
		System.out.printf("Ultimo 'a' esta localizado no index %d\n", letras.lastIndexOf('a',5));
		System.out.printf("Ultimo '$' esta localizado no index %d\n", letras.lastIndexOf('$'));
		System.out.println();
		
		//Teste indexOf para Localizar uma Substring em uma String
		System.out.printf("\"def\" estalocalizado no index %d \n",letras.indexOf("def"));
		
		// 2 Argumento string e outro o ponto inicial que come�ar� a pesquisa
		System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def", 7));
		System.out.printf("\"hello\" esta localizado no index %d \n\n", letras.indexOf("hello"));
	}
	
	
}
