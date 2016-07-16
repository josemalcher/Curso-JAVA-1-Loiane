package sobreStringsDevmedia;

public class Listagem8 {
	/*
	 * M�todo compareTo
	 * 
	 * Esse m�todo pode retornar 0 se as strings forem iguais, um n�mero
	 * negativo se a string que invoca o compareTo for menor que a string que �
	 * passada como um argumento e um n�mero positivo se a string que invoca o
	 * compareTo for maior que a string que � passada como argumento.
	 * 
	 * Listagem 8: Exemplo do m�todo compareTo
	 */
	public static void main(String[] args) {
		String nome1 = new String("Carlos");
		String nome2 = new String("Carla");
		
		System.out.println("nome2.compareTo(nome1) = "+ nome2.compareTo(nome1));
		System.out.println("nome1.compareTo(nome2) = "+nome1.compareTo(nome2));
		
		Character letraA = new Character('a');
		Character letraB = new Character('b');
		
		System.out.println("letraA.compareTo(letraB) = "+ letraA.compareTo(letraB));
		
	}
}
