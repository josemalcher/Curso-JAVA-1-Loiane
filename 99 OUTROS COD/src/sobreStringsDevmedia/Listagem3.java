package sobreStringsDevmedia;

public class Listagem3 {
	public static void main(String[] args) {
		/*
		 * Método Length
		 * 
		 * Retorna o tamanho de uma String. Na Listagem 03 está sendo impresso o
		 * tamanho da variável e verificando uma condição com o tamanho através
		 * do método que a classe String possui.
		 * 
		 * Listagem 3: Exemplo do método length
		 */
		
		String nomeCurso = "Java para WEB";
		
		System.out.printf("\nTamano da variável nomeCurso = %d ",nomeCurso.length());
		
		if(nomeCurso.length() > 13){
			System.out.println("\nTamanho maior que 13");
		}else if(nomeCurso.length() == 13){
			System.out.println("\nTamanho igual a 13");
		}else{
			System.out.println("\nTamanho menor que 13");
		}
		
	}
}
