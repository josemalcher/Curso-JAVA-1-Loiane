package aula17.labs;

import java.util.Scanner;

public class Exer01Loiane {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		boolean notaValida = false;
		
		do{
			System.out.println("Entre com a a NOTA");
			
			double nota = leitor.nextDouble();
			
			if(nota >=0 && nota <= 10){
				notaValida = true;
				System.out.println("NOTA DIGITADA: "+ nota);
			}else{
				//notaValida = false
				System.out.println("Nota inválida, digite novamente");
			}
		}while(!notaValida);
		
		

	}

}
