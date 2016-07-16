package sobreStringsDevmedia;

public class Listagem7 {
	/*
	 * Método Equals
	 * 
	 * É um método da classe Object sobrescrito na clase String, que serve para
	 * testar dois objetos.
	 * 
	 * Listagem 7: Exemplo de comparação com método equals
	 */
	public static void main(String[] args) {
		String nome1 = new String("Carlos");
		String nome2 = new String("Carlar");
		
		if(nome1.equals(nome2)){
			System.out.println("Os nomes são iguais");
		}else{
			System.out.println("Nomes são diferentes");
		}
		
		Character letraA = new Character('a');
		Character letraB = new Character('b');
		if(letraA.equals(letraB)){
			System.out.println("As letras são iguais");
		}else{
			System.out.println("As letras são diferentes");
		}
				
		
	}
}
