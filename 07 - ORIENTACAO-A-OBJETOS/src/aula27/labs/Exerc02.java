package aula27.labs;

public class Exerc02 {
	/*
	 * 2. Cria uma classe para representar uma conta corrente que possui um
	 * n�mero, um saldo, um status que informa se ela � especial ou n�o, um
	 * limite. Desenvolva m�todos para realizar saque (verificando se o cliente
	 * pode realizar saques), despositar dinheiro, consultar saldo e verificar
	 * se o cliente est� usando cheque especial ou n�o. Desenvolva um programa
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
			System.out.println("N�o foi possivel realizar seu saque. N�o h� saldo");
		}
		
		saqueEfetuado = contaJOSE.realizarSaques(500);
		System.out.println("Tentativa de saque de 500 reais. (AL�m do limite");
		
		if(saqueEfetuado){
			System.out.println("Tentativa de saque de 500 reais");
			contaJOSE.consultaSaldo();
		}else{
			System.out.println("N�o foi possivel realizar saque. N�O h� SALDO");
		}
		
		System.out.println("Deposito de 500 reaisl");
		contaJOSE.depositar(500);
		contaJOSE.consultaSaldo();
		
		if(contaJOSE.verificaUsoChequeEspecial()){
			System.out.println("Est� usando chegue especial");
		}else{
			System.out.println("UFA!! N�o esta usando o cheque especial");
		}
		
		contaJOSE.realizarSaques(600);
		contaJOSE.consultaSaldo();
		if(contaJOSE.verificaUsoChequeEspecial()){
			System.out.println("VOCE ESTA NO VERMELHO, USANDO CHEQUE ESPECIAL");
		}else{
			System.out.println("AEE... N�o est� no vermelho... N�o h� uso do C. Especial");
		}
		
	}
}
