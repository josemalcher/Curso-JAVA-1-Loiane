package sobreStringsDevmedia;

public class Listagem7 {
	/*
	 * M�todo Equals
	 * 
	 * � um m�todo da classe Object sobrescrito na clase String, que serve para
	 * testar dois objetos.
	 * 
	 * Listagem 7: Exemplo de compara��o com m�todo equals
	 */
	public static void main(String[] args) {
		String nome1 = new String("Carlos");
		String nome2 = new String("Carlar");
		
		if(nome1.equals(nome2)){
			System.out.println("Os nomes s�o iguais");
		}else{
			System.out.println("Nomes s�o diferentes");
		}
		
		Character letraA = new Character('a');
		Character letraB = new Character('b');
		if(letraA.equals(letraB)){
			System.out.println("As letras s�o iguais");
		}else{
			System.out.println("As letras s�o diferentes");
		}
				
		
	}
}
