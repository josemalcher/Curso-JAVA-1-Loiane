package sobreStringsDevmedia;

public class Listagem9 {
	/*
	 * Método equalsIgnoreCase
	 * 
	 * Esse método ignora a distinção entre letras maiúsculas e minúsculas nas
	 * duas strings comparadas.
	 * 
	 * Listagem 9: Exemplo do método equalsIgnoreCase
	 */
	public static void main(String[] args) {
		String nome1 = new String("Carlos");
		String nome2 = new String("carlos");
		
		if(nome1.equalsIgnoreCase(nome2)){
			System.out.println("Os nomes tem o mesmo significado");
		}
	}
}
