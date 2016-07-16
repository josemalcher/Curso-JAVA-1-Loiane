package sobreStringsDevmedia;

public class Listagem10 {
	/*
	 * Métodos startsWith e endswith
	 * 
	 * Os métodos startsWith e endsWith aceitam uma string e um número inteiro
	 * como argumentos, retornando um valor booleano que indica se a string
	 * inicia ou termina, respectivamente, com o texto informado a partir da
	 * posição dada.
	 * 
	 * Listagem 10: Exemplo do método startsWith e endswith
	 */
	public static void main(String[] args) {
		String[] nomes =  { "iniciado", "iniciando", "finalizado", "finalizando"};
		for(String recebeNomes : nomes){
			if(recebeNomes.startsWith("in")){
				System.out.printf("\"%s\" inicia com \"in\" \n ", recebeNomes);
			}
		}
		System.out.println();
		
		//Testa método Starwith iniciando da posição 2 de string
		
		for(String recebeNomes : nomes){
			if(recebeNomes.startsWith("ici",2)){
				System.out.printf("\"%s\" inicia com \"ici\" na posição 2 \n", recebeNomes);
			}
		}
		System.out.println();
		
		for(String recebeNomes : nomes){
			if(recebeNomes.endsWith("ado")){
				System.out.printf("\"%s\" termina com \"ado\" \n", recebeNomes);
			}
		}
		
	}
}
