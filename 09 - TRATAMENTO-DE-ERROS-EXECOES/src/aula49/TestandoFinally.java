package aula49;

public class TestandoFinally {
	public static void main(String[] args) {
		int[] numeros = { 4, 8, 16, 32, 64, 128 };
		int[] demon = { 2, 0, 4, 8, 0 };

		for (int i = 0; i < numeros.length; i++) {
			try {
				System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));
			} catch (ArithmeticException e) {
				System.out.println("Erro ao dividir por zero");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Posi��o do array inv�lidade");
			}
			finally {
				System.out.println("Linha executada ao final do processo - SEMPRE ser� executado!");
			}
		}
	}
}
