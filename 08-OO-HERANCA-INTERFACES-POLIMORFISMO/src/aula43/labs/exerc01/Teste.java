package aula43.labs.exerc01;

public class Teste {
	
	/*
	 * Lista de exercícios: Pasta /pdf/
	 * 
	 */
	
	private static void realizarSaque(Conta conta, double valorSacar){
		if(conta.sacar(valorSacar)){
			System.out.println("Saque OK R$ "+ conta.getSaldo());
		}else{
			System.out.println("Saldo Insuficiente R$" + valorSacar + "Na carteira tem R$ "+ conta.getSaldo());
		}
	}
	
	
	public static void main(String[] args) {
		
		//classe conta
		System.out.println("TESTE CONTA BANCARIA");
		
		Conta conta01 = new Conta();
		conta01.setNomeCliente("Jose Malcher");
		conta01.setNumConta(44512);
		
		conta01.depositar(100);
		realizarSaque(conta01, 50);
		realizarSaque(conta01, 10);
		System.out.println(conta01);
		
		
		System.out.println("TESTE CONTA POUPANÇA");
		
		System.out.println("TESTE CONTA ESPECIAL");
		
		
		
		
	}
}
