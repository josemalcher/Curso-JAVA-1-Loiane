package sobreStringsDevmedia;

public class Listagem5 {
	/*
	 * Método getChars
	 * 
	 * Recupera um conjunto de caracteres de uma String. Esse método possui os
	 * seguintes parâmetros de entrada:
	 * 
	 * srcBegin – Índice do primeiro caractere da string a ser copiada. 
	 * srcEnd - Índice depois da última string a ser copiada. 
	 * dst – O destino do array.
	 * dstBegin – o início do deslocamento no array de destino.
	 * 
	 * Listagem 5: Exemplo do método getChars
	 */
	public static void main(String[] args) {
		String nomeCurso = new String("Curso de JAVA Web");
		//É A DIFERENÇA DO 1º E 2º PARÂMETRO DO MÉTODO getChars
		//SE DIMINUIR OS 2 O RESULTADO TEM QUE SER O MESMO INICIADO NO ARRAY
		char[] numIndice = new char[17];
		
		nomeCurso.getChars(0,17,numIndice,0);
		
		for(char caracter : numIndice){
			System.out.println("["+caracter+"]");
		}
		System.out.println("\n\n Abaixo indice demonstrativo dos valores");
		
		int[] b = {0,1,2,3,4,5,6};
		for (int i=0 ; i < b.length ; i++ ){
			System.out.println("["+b[i]+"]");
		}
		
	}
}
