package sobreStringsDevmedia;

public class Listagem17 {
	/*
	 * Método String.valueOf
	 * 
	 * Converte os tipos primitivos em um objeto do tipo String.
	 * 
	 * Listagem 17: Exemplo do método valueOf
	 */
	public static void main(String[] args) {
		double d = 102939939.939;
		boolean b = true;
		long l = 1232874;
		char[] arrayChar = {'a', 'b', 'c', 'd', 'e', 'f','g' };
		
		System.out.println("Retorna Valor : " + String.valueOf(d) );
		System.out.println("Retorna Valor : " + String.valueOf(b) );
 		System.out.println("Retorna Valor : " + String.valueOf(l) );
 		System.out.println("Retorna Valor : " + String.valueOf(arrayChar) );
		
	}
}
