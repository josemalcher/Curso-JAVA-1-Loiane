package aula43.labs.exerc01;

public class Teste {
	
	/*
	 * Lista de exercícios: Pasta /pdf/
	 * 
	 */
	
	private static void realizarSaque(Conta conta, double valorSacar){
		if(conta.sacar(valorSacar)){
			System.out.println("Saque OK Saldo atual é R$ "+ conta.getSaldo());
		}else{
			System.out.println("Saldo Insuficiente R$" + valorSacar + "Na carteira tem R$ "+ conta.getSaldo());
		}
	}
	
	
	public static void main(String[] args) {
		
		//classe conta
		System.out.println("****TESTE CONTA BANCARIA");
		
		Conta conta01 = new Conta();
		conta01.setNomeCliente("Jose Malcher");
		conta01.setNumConta(44512);
		
		conta01.depositar(100);
		realizarSaque(conta01, 50);
		realizarSaque(conta01, 10);
		System.out.println(conta01);
		
		
		System.out.println("****TESTE CONTA POUPANÇA");
		ContaPoupanca contaPoupanca01 = new ContaPoupanca();
		contaPoupanca01.setNomeCliente("Cliente Poupança");
		contaPoupanca01.setNumConta(123456);
		contaPoupanca01.setDiaRendimento(25);
		
		contaPoupanca01.depositar(100);
		
		realizarSaque(contaPoupanca01, 20);
		realizarSaque(contaPoupanca01, 30);
		
		//
		if(contaPoupanca01.calculoNovoSaldo(0.5)){
			System.out.println("Rendimento aplicado, Novo Saldo = R$" + contaPoupanca01.getSaldo());
		}else{
			System.out.println("Não é dia de Rendimento");
		}
		
		System.out.println(contaPoupanca01);
		
		
		System.out.println("****TESTE CONTA ESPECIAL");
		
		ContaEspecial contaEspecia01 = new ContaEspecial();
		contaEspecia01.setNomeCliente("Cliente Especial");
		contaEspecia01.setNumConta(123);
		contaEspecia01.setSaldo(50);
		contaEspecia01.setLimite(50);
		
		System.out.println(contaEspecia01);
		contaEspecia01.depositar(100);
		
		realizarSaque(contaEspecia01, 50);
		realizarSaque(contaEspecia01, 20);
		realizarSaque(contaEspecia01, 20);
		realizarSaque(contaEspecia01, 20);
		realizarSaque(contaEspecia01, 20);
		System.out.println(contaEspecia01);
		
		
		
	}
}
