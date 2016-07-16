package sobreStringsDevmedia;

public class Listagem15 {
	/*
	 * M�todo trim
	 * 
	 * Gera um novo objeto string, removendo todos os caracteres de espa�o em
	 * branco que aparecem no in�cio ou no fim da string em que o m�todo opera.
	 * O m�todo retorna um novo objeto string contendo a string sem espa�o em
	 * branco inicial ou final. A string original permanece inalterada. 
	 * 
	 * M�todo toCharArray
	 * 
	 * Cria um novo array de caracteres que cont�m uma c�pia dos caracteres da
	 * vari�vel apontada.
	 * 
	 * Listagem 15: Exemplo do m�todo trim e toCharArray
	 */
	
	public static void main(String[] args) {
		String s1 = "Ol�";
		String s2 = "TCHAU";
		String s3 = "    espa�os       ";
		
		System.out.println("s1 = "+ s1 + "\n" + "s2 = "+ s2 + "\n" + "s3 = "+s3);
		
		//M�todo REPLACE
		System.out.printf("Replace 'l' por 'L' no s1: %s\n\n",s1.replace('l', 'L'));
		
		//M�todo UPPER e LOWCase
		System.out.printf("s1.toUpperCase() = %s\n",s1.toUpperCase());
		System.out.printf("s2.toUpperCase() = %s\n",s2.toLowerCase());
		
		//M�todo TRIM - REMOVER OS Espa�os
		System.out.printf("s3 depois do trim = \"%s\"\n\n", s3.trim());
		
		//COnverter o ol� para CHAR
		
		char[] charArray = s1.toCharArray();
		System.out.println("s1 como um caractere array = ");
			for(char caracter : charArray){
				System.out.println(caracter);
			}
	}
	
	
}
