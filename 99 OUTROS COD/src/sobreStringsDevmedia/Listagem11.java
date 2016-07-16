package sobreStringsDevmedia;

public class Listagem11 {
	/*
	 * indexOf
	 * 
	 * Localiza a primeira ocorrência de um caractere em uma string. Se o método
	 * localizar o caractere, é retornado o índice do caractere na String, caso
	 * contrário retorna -1. Existem duas versões do indexOf que procuram
	 * caracterers em uma String.
	 * 
	 * 1ª versão – aceita um inteiro que é conhecido como o número do índice na
	 * String. 2ª versão – aceita dois argumentos inteiros – o caractere e o
	 * índice inicial em que a pesquisa da String deve iniciar.
	 * 
	 * lastIndexOf
	 * 
	 * Localiza a última ocorrência de um caractere em uma string. O método
	 * procura do fim da string em direção ao começo, se encontrar o caractere é
	 * retornado o seu índice na string, caso contrário retorna -1. Existem duas
	 * versões do lastIndexOf que pesquisam por caracteres em uma string.
	 * 
	 * 1ª versão – utiliza um inteiro do caractere. 2ª versão – aceita 2
	 * argumentos – um inteiro de caractere e o índice a partir do qual iniciar
	 * a pesquisa de trás para frente.
	 * 
	 * 
	 * Listagem 11: Exemplo dos métodos indexOf e lastIndexOf
	 */
	
	public static void main(String[] args) {
		String letras = "abcadefghijklmcopqrsdeftuvz";
		
		//teste indexOf para localizar um caractere em uma String
		System.out.printf("ultimo 'c' esta localizado no index %d \n", letras.indexOf('c'));
		System.out.printf("ultimo 'a' esta localizado no indes %d \n", letras.indexOf('a', 1));
		System.out.println();
		
		// '-1' Não existe
		System.out.printf("'$' esta localizado no index %d \n\n", letras.indexOf('$'));
		System.out.println();
		
		//Teste lasIndexOf para localizar um caractere em uma String
		System.out.printf("Ultimo 'c' esta localizado no index %d\n", letras.lastIndexOf('c'));
		System.out.printf("Ultimo 'a' esta localizado no index %d\n", letras.lastIndexOf('a',5));
		System.out.printf("Ultimo '$' esta localizado no index %d\n", letras.lastIndexOf('$'));
		System.out.println();
		
		//Teste indexOf para Localizar uma Substring em uma String
		System.out.printf("\"def\" estalocalizado no index %d \n",letras.indexOf("def"));
		
		// 2 Argumento string e outro o ponto inicial que começará a pesquisa
		System.out.printf("\"def\" esta localizado no index %d\n", letras.indexOf("def", 7));
		System.out.printf("\"hello\" esta localizado no index %d \n\n", letras.indexOf("hello"));
	}
	
	
}
