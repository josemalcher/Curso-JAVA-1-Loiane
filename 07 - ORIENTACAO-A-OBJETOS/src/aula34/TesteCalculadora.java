package aula34;

public class TesteCalculadora {

	static int resultadoSoma;
	
	public static void main(String[] args) {
		
		resultadoSoma = MinhaCalculadora.soma(10, 20, 30);
		
		System.out.println(resultadoSoma);
		
		
		MinhaCalculadora.soma(2, 10);
		
		
		System.out.println(soma2Valores(10,10));
		
	}
	
	static int soma2Valores(int num1, int num2){
		return MinhaCalculadora.soma(num1, num2);
	}
	
}
