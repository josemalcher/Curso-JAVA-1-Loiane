package sobreStringsDevmedia;

public class Listagem4 {
	public static void main(String[] args) {
		/*
		 * M�todo charAt
		 * 
		 * Retorna o caractere em uma localiza��o espec�fica em uma String. Esse
		 * m�todo possui um par�metro do tipo inteiro que � usado como �ndice,
		 * retornando a partir dessa posi��o inserida nesse par�metro, sendo que
		 * quando percorrido um texto o �ndice sempre come�a a ser contado do
		 * n�mero 0 (zero) em diante.
		 * 
		 * Listagem 4: Exemplo m�todo charAt
		 */
		
		String nomeCurso = "JAVA para Web";
		
		if(nomeCurso.charAt(1) == 'A'){
			System.out.println("O caractere A esta na posi��o 1");
		}else{
			System.out.println("Posi��o compat�vel");
		}
		
		// FORMA Din�mica
		char percorreString = nomeCurso.charAt(1);
		System.out.println("Na posi��o 1 tem o caractere = "+percorreString);
		
	}
}
