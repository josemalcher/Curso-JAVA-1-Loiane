package aula27.labs;

public class Exerc02 {
	/*
	 * 2. Cria uma classe para representar uma conta corrente que possui um
	 * número, um saldo, um status que informa se ela é especial ou não, um
	 * limite. Desenvolva métodos para realizar saque (verificando se o cliente
	 * pode realizar saques), despositar dinheiro, consultar saldo e verificar
	 * se o cliente está usando cheque especial ou não. Desenvolva um programa
	 * para testar essa classe.
	 */
	public static void main(String[] args) {
		
		ContaCorrente contaJOSE = new ContaCorrente();
		
		contaJOSE.numero = "123";
		contaJOSE.agencia = "321";
		contaJOSE.especial = true;
		contaJOSE.limiteEspecial = 500;
		contaJOSE.saldo = -10;
		
		System.out.println("Saldo Atual da conta = R$ " + contaJOSE.saldo);
		
		boolean saqueEfetuado = contaJOSE.realizarSaques(10);
		
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			contaJOSE.consultaSaldo();
		}else{
			System.out.println("Não foi possivel realizar seu saque. Não há saldo");
		}
		
		saqueEfetuado = contaJOSE.realizarSaques(500);
		System.out.println("Tentativa de saque de 500 reais. (ALém do limite");
		
		if(saqueEfetuado){
			System.out.println("Tentativa de saque de 500 reais");
			contaJOSE.consultaSaldo();
		}else{
			System.out.println("Não foi possivel realizar saque. NÃO hÁ SALDO");
		}
		
		System.out.println("Deposito de 500 reaisl");
		contaJOSE.depositar(500);
		contaJOSE.consultaSaldo();
		
		if(contaJOSE.verificaUsoChequeEspecial()){
			System.out.println("Está usando chegue especial");
		}else{
			System.out.println("UFA!! Não esta usando o cheque especial");
		}
		
		contaJOSE.realizarSaques(600);
		contaJOSE.consultaSaldo();
		if(contaJOSE.verificaUsoChequeEspecial()){
			System.out.println("VOCE ESTA NO VERMELHO, USANDO CHEQUE ESPECIAL");
		}else{
			System.out.println("AEE... Não está no vermelho... Não há uso do C. Especial");
		}
		
	}
}
