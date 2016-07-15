package aula15;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Entre com o dia da Semana");
		int diaDaSemana = leitor.nextInt();
		
/*		if(diaDaSemana == 1){
			System.out.println("Domingo");
		}else if(diaDaSemana == 2){
			System.out.println("Segunda");
		}else if(diaDaSemana ==3){
			System.out.println("Terça-Feira");
		}else if(diaDaSemana == 4){
			System.out.println("Quarta-Feira");
		}else if(diaDaSemana == 5){
			System.out.println("Quinta-Feira");
		}else if(diaDaSemana == 6){
			System.out.println("Sexta-Feira");
		}else if(diaDaSemana == 7){
			System.out.println("Sábado");
		}else{
			System.out.println("Não é um dia valido!!");
		}
		*/
		/*switch(diaDaSemana){
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda"); break;
		case 3: System.out.println("Terça"); break;
		case 4: System.out.println("Quarta"); break;
		case 5: System.out.println("Quinta"); break;
		case 6: System.out.println("Sexta"); break;
		case 7: System.out.println("Sabado"); break;
		default: System.out.println("Não é um dia da semana válido");
		}
		*/
		switch(diaDaSemana){
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.println("Dia Últil"); break;
		case 1:
		case 7: System.out.println("Fim de Semana");break;
		default: System.out.println("Não é um dia da semana válido");
		}
		
	}
	
	
	

}
