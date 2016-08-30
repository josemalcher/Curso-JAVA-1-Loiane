package aula52.labs;

import java.util.Scanner;

/*
 * Resolução loiane
 * https://github.com/loiane/curso-java-basico/tree/master/eclipse/curso-java-basico/src/com/loiane/cursojava/aula52/labs
 */
public class Teste {

	public static int obterOpcaoMenu(Scanner leitor) {
		boolean entradaValida = false;
		int opcao = 3;
		while (!entradaValida) {
			System.out.println("Digite a opção desejada: ");
			System.out.println("1: consultar contato");
			System.out.println("2: adicionar contato ");
			System.out.println("3: Sair ");
			
			try{
				String entrada = leitor.nextLine();
				opcao = Integer.parseInt(entrada);
				if(opcao == 1 || opcao == 2 || opcao == 3){
					entradaValida = true;
					
				}else{
					throw new Exception("Entrada in´valida \n");
				}
			}catch(Exception e){
				System.out.println("Entrada inválida, digite novamente \n");
			}
			
		}
		return opcao;
	}

	public static void main(String[] args) {
		/*
		 * Contato c1 = new Contato(); System.out.println(c1);
		 * 
		 * Contato c2 = new Contato(); System.out.println(c2);
		 * 
		 * Contato c3 = new Contato(); System.out.println(c3);
		 */
		
		Scanner leitor = new Scanner(System.in);
		int opcao = obterOpcaoMenu(leitor);
		
		if(opcao == 1){
			
		}else if(opcao == 2){
			
		}else if(opcao ==3){
			System.exit(0);
		}

	}
}
