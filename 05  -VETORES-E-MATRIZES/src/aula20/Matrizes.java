package aula20;

public class Matrizes {
	public static void main(String[] args) {

		double[][] notasALunos = new double[3][4];
		
		notasALunos[0][0] = 7;
		notasALunos[0][1] = 7;
		notasALunos[0][2] = 7;
		notasALunos[0][3] = 7;
		
		notasALunos[1][0] = 3;
		notasALunos[1][1] = 9;
		notasALunos[1][2] = 7;
		notasALunos[1][3] = 6.5;
		
		notasALunos[2][0] = 9;
		notasALunos[2][1] = 4;
		notasALunos[2][2] = 7;
		notasALunos[2][3] = 3.5;
		
		for(int i = 0; i< notasALunos.length ; i++){
			//System.out.println(notasALunos[i] + " "); //imprime o objeto na memória
			for(int j = 0 ; j < notasALunos[i].length ; j++){
				System.out.print(notasALunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		notasALunos[1][3] = 8;
		System.out.println();
		for(int i = 0 ; i < notasALunos.length ; i++ ){
			for(int j = 0 ; j < notasALunos[i].length ; j++){
				System.out.print(notasALunos[i][j] + " - ");
			}
			System.out.println();
		}
		
		System.out.println("Calculando a média de cada aluno");
		
		double soma;
		for(int i = 0 ; i < notasALunos.length ; i++){
			soma = 0 ;
			for(int j = 0 ; j < notasALunos[i].length ; j++){
				soma += notasALunos[i][j];
			}
			System.out.println("Média do aluno "+ i + " é = "+ (soma/4));
		}
		
		double[]   notasAluno1 = {7,8,9,10};
		double[][] notasAluno2 = {{7,8,9,10},{6,7,8,5}};
		System.out.println("Output da matris notasAluno2");
		for(int i = 0 ; i < notasAluno2.length ; i++){
			for(int j = 0 ; j < notasAluno2[i].length ; j++){
				System.out.print(notasAluno2[i][j] + " - ");
			}
			System.out.println();
		}
		
	}
}
