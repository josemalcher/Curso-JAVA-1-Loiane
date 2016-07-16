package sobreStringsDevmedia;

public class Listagem8 {
	/*
	 * Método compareTo
	 * 
	 * Esse método pode retornar 0 se as strings forem iguais, um número
	 * negativo se a string que invoca o compareTo for menor que a string que é
	 * passada como um argumento e um número positivo se a string que invoca o
	 * compareTo for maior que a string que é passada como argumento.
	 * 
	 * Listagem 8: Exemplo do método compareTo
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
