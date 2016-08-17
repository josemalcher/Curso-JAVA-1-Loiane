package aula35.labs;
//EXTRA - LOIANE
public class FibonacciMelhorado {

	private final static int TAM_MEMORIA = 50;
	private static long[] memoria = new long[TAM_MEMORIA];

	public static long fibonacci(int num) {
		if (num < 2) {
			return memoria[num];
		}

		// verifica se o NUMERO foi calculado e SALVO na memoria
		// Caso não foi salco, calcula e SALVA
		long fib = memoria[num];
		if (fib == 0) {
			fib = fibonacci(num - 1) + fibonacci(num - 2);
			memoria[num] = fib;
		}
		return memoria[num];
	}
	//****************************
	
	public static void main(String[] args) {
		memoria[0] = 0;
		memoria[1] = 1;
		
		for(int i = 1 ; i < TAM_MEMORIA ; i++){
			System.out.println("Fibonacci de " + i + ": " + fibonacci(i));
		}
	}

}
