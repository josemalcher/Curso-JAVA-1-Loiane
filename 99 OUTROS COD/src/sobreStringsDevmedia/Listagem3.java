package sobreStringsDevmedia;

public class Listagem3 {
	public static void main(String[] args) {
		/*
		 * M�todo Length
		 * 
		 * Retorna o tamanho de uma String. Na Listagem 03 est� sendo impresso o
		 * tamanho da vari�vel e verificando uma condi��o com o tamanho atrav�s
		 * do m�todo que a classe String possui.
		 * 
		 * Listagem 3: Exemplo do m�todo length
		 */
		
		String nomeCurso = "Java para WEB";
		
		System.out.printf("\nTamano da vari�vel nomeCurso = %d ",nomeCurso.length());
		
		if(nomeCurso.length() > 13){
			System.out.println("\nTamanho maior que 13");
		}else if(nomeCurso.length() == 13){
			System.out.println("\nTamanho igual a 13");
		}else{
			System.out.println("\nTamanho menor que 13");
		}
		
	}
}
