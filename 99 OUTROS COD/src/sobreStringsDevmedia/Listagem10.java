package sobreStringsDevmedia;

public class Listagem10 {
	/*
	 * M�todos startsWith e endswith
	 * 
	 * Os m�todos startsWith e endsWith aceitam uma string e um n�mero inteiro
	 * como argumentos, retornando um valor booleano que indica se a string
	 * inicia ou termina, respectivamente, com o texto informado a partir da
	 * posi��o dada.
	 * 
	 * Listagem 10: Exemplo do m�todo startsWith e endswith
	 */
	public static void main(String[] args) {
		String[] nomes =  { "iniciado", "iniciando", "finalizado", "finalizando"};
		for(String recebeNomes : nomes){
			if(recebeNomes.startsWith("in")){
				System.out.printf("\"%s\" inicia com \"in\" \n ", recebeNomes);
			}
		}
		System.out.println();
		
		//Testa m�todo Starwith iniciando da posi��o 2 de string
		
		for(String recebeNomes : nomes){
			if(recebeNomes.startsWith("ici",2)){
				System.out.printf("\"%s\" inicia com \"ici\" na posi��o 2 \n", recebeNomes);
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
