package aula20;

import java.util.Scanner;

public class MatrizIrregular {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Entre com o numero de pessoas que serão entrevistados");
		int numEntrevistados = leitor.nextInt();
		
		String[][] nomesFIlhos = new String[numEntrevistados][];
		
		for(int i = 0 ; i < nomesFIlhos.length ; i++){
			System.out.println("Entre com a quantidade de filhos");
			int quantidadeFilhos = leitor.nextInt();
			
			nomesFIlhos[i] = new String[quantidadeFilhos];
			
			for(int j = 0 ; j < nomesFIlhos[i].length ; j++){
				System.out.println("Digite o nome do filho " + (j + 1));
				nomesFIlhos[i][j] = leitor.next();
			}
		}
		
		for(int i = 0 ; i < nomesFIlhos.length ; i++){
			System.out.println("Pessoa "+ i + " tem " + nomesFIlhos[i].length + " filhos");
			for(int j = 0 ; j < nomesFIlhos[i].length ; j++){
				System.out.println(nomesFIlhos[i][j]);
			}
		}

	}

}
