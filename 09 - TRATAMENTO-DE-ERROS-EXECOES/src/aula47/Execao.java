package aula47;

public class Execao {
	public static void main(String[] args) {
		try {
			int[] vetor = new int[4];
			System.out.println("antes da Exception");
			
			vetor[4] = 1;
			
			System.out.println("Esse texto n�o ser� impresso");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exce��o ao acessar o indice do ver que n�o existe \n"+ e);
		}
		System.out.println("Texto ser� impresso apos a exception");
	}
}
