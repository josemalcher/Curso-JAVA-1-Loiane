package sobreStringsDevmedia;

public class Listagem4 {
	public static void main(String[] args) {
		/*
		 * Método charAt
		 * 
		 * Retorna o caractere em uma localização específica em uma String. Esse
		 * método possui um parâmetro do tipo inteiro que é usado como índice,
		 * retornando a partir dessa posição inserida nesse parâmetro, sendo que
		 * quando percorrido um texto o índice sempre começa a ser contado do
		 * número 0 (zero) em diante.
		 * 
		 * Listagem 4: Exemplo método charAt
		 */
		
		String nomeCurso = "JAVA para Web";
		
		if(nomeCurso.charAt(1) == 'A'){
			System.out.println("O caractere A esta na posição 1");
		}else{
			System.out.println("Posição compatível");
		}
		
		// FORMA Dinâmica
		char percorreString = nomeCurso.charAt(1);
		System.out.println("Na posição 1 tem o caractere = "+percorreString);
		
	}
}
