package aula33;

import java.util.Random;

public class TesteCalculadora {
	public static void main(String[] args) {
		
		Random numeroRandom = new Random();
		
		MinhaCalculadora calculo = new MinhaCalculadora();
	
			
		calculo.soma(1,2);
		
		calculo.soma(1.3 , 1.7);
		
		
		int[] vetorInteiros = new int[5];
		for(int i = 0 ; i < vetorInteiros.length ; i++){
			vetorInteiros[i] = numeroRandom.nextInt(100);
		}
		
		System.out.println("Total = "+calculo.soma(vetorInteiros));
		
	}
}
