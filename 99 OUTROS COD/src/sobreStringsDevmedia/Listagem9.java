package sobreStringsDevmedia;

public class Listagem9 {
	/*
	 * M�todo equalsIgnoreCase
	 * 
	 * Esse m�todo ignora a distin��o entre letras mai�sculas e min�sculas nas
	 * duas strings comparadas.
	 * 
	 * Listagem 9: Exemplo do m�todo equalsIgnoreCase
	 */
	public static void main(String[] args) {
		String nome1 = new String("Carlos");
		String nome2 = new String("carlos");
		
		if(nome1.equalsIgnoreCase(nome2)){
			System.out.println("Os nomes tem o mesmo significado");
		}
	}
}
