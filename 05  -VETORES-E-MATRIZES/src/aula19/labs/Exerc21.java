package aula19.labs;

public class Exerc21 {
	/*
	 * Falhou a diagramação da ficha de exercício!! FONTE:
	 * 
	 * http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/Lista%20Vetores.HTM 
	 * Gerar aleatoriamente um vetor A com 10 elementos inteiros e
	 * iguais a 0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1);
	 * Pede-se para implementar um programa que determine o percentual de
	 * números 0's e 1's existentes no vetor A.
	 * 
	 * resolução: http://www.pb.utfpr.edu.br/omero/Java/Fontes/Lista%20Vetores/_21.Htm
	 * 
	 */
	public static void main(String[] args) {
		
		int n = 10;
		int a[] = new int[n];
		int i;
		int ctum = 0;
		int ctzero = 0;
		float pum, pzero;
		
		for(i = 0 ; i < n ; i++){
			a[i] = (int)Math.round(Math.random()*1);
		}
		
		for(i = 0 ; i < n ; i++){
			System.out.printf("a[%d] = %d\n",i , a[i]);
			
			if(a[i] == 0){
				ctzero = ctzero + 1;
			}else{
				ctum = ctum + 1;
			}
		}
		
		pzero = (ctzero / (float)n) * 100;
		pum   = (ctum / (float)n) * 100;
		
		System.out.printf("\n Existem %d números O's, ou seja, %.2f%%", ctzero, pzero);
	    System.out.printf("\n Existem %d números 1's, ou seja, %.2f%%\n", ctum, pum);
		
		
		
		
	}
}
