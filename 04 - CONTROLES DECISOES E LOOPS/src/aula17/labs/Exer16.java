package aula17.labs;

public class Exer16 {
	/*
	 * 15. A série de Fibonacci é formada pela seqüência
	 * 1,1,2,3,5,8,13,21,34,55,... Faça um programa capaz de gerar a série até o
	 * n−ésimo termo.
	 */
	//Loiane resolução

	public static void main(String[] args) {
		int primeiro = 1;
		int segundo =  1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo <= 500){
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
	}

}
