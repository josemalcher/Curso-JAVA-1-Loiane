package aula47;

public class Execao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("antes da Exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto não será impresso");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceção ao acessar o indice do ver que não existe \n"+ e);
		}
		System.out.println("Texto será impresso apos a exception");
	}
}
