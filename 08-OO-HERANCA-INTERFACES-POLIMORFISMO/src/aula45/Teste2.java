package aula45;

public class Teste2 {

	public static void main(String[] args) {
		
		//Exemplo 1 - OK
		// RETORNO do m�todo pode referenciar STRING
		Object o1 = obterString();
		String s1 = (String)o1;
		
		//Exemplo 2 - OK
		//o2 referencia String explicitamente
		Object o2 = "Curso de JAVA";
		String s2 = (String)o2;
		
		//exemplo 3 - FALHA em tempo de execu��o
		Object o3 = new Object();
		String s3 = (String)o3;
		
		//Exemplo 4 - Falaha em tempo de COMPILA��O
		//o4 nunca referencia String j� que retorno � int
		Integer o4 = obterInteiro();
		//String s4 = (String)o4;

	}
	
	public static String obterString(){
		return "Minha String";
	}
	public static int obterInteiro(){
		return 1;
	}

}
