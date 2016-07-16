package sobreStringsDevmedia;

public class Listagem15 {
	/*
	 * Método trim
	 * 
	 * Gera um novo objeto string, removendo todos os caracteres de espaço em
	 * branco que aparecem no início ou no fim da string em que o método opera.
	 * O método retorna um novo objeto string contendo a string sem espaço em
	 * branco inicial ou final. A string original permanece inalterada. 
	 * 
	 * Método toCharArray
	 * 
	 * Cria um novo array de caracteres que contém uma cópia dos caracteres da
	 * variável apontada.
	 * 
	 * Listagem 15: Exemplo do método trim e toCharArray
	 */
	
	public static void main(String[] args) {
		String s1 = "Olá";
		String s2 = "TCHAU";
		String s3 = "    espaços       ";
		
		System.out.println("s1 = "+ s1 + "\n" + "s2 = "+ s2 + "\n" + "s3 = "+s3);
		
		//Método REPLACE
		System.out.printf("Replace 'l' por 'L' no s1: %s\n\n",s1.replace('l', 'L'));
		
		//Método UPPER e LOWCase
		System.out.printf("s1.toUpperCase() = %s\n",s1.toUpperCase());
		System.out.printf("s2.toUpperCase() = %s\n",s2.toLowerCase());
		
		//Método TRIM - REMOVER OS Espaços
		System.out.printf("s3 depois do trim = \"%s\"\n\n", s3.trim());
		
		//COnverter o olá para CHAR
		
		char[] charArray = s1.toCharArray();
		System.out.println("s1 como um caractere array = ");
			for(char caracter : charArray){
				System.out.println(caracter);
			}
	}
	
	
}
