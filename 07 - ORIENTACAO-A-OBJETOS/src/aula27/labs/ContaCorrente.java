package aula27.labs;

public class ContaCorrente {
	//resolução da loiane
	
	String numero;
	String agencia;
	boolean especial;
	double limiteEspecial;
	double saldo;
	
	boolean realizarSaques(double quantidadeASacar){
		//tem saldo na conta
		if(saldo >= quantidadeASacar){
			saldo -= quantidadeASacar;
			return true;
		}else{ //NÃO tem saldo na conta
			if(especial){
				//verifica se ha limite no especial tem saldo
				double limite = limiteEspecial + saldo;
				if(limite >= quantidadeASacar){
					saldo -= quantidadeASacar;
					return true;
				}else{
					return false;
				}
			}else{
				return false; // NÃO é especial e não tem saldo suficiente
			}
		}
		
	}
	
	void depositar(double valorDepositado){
		saldo += valorDepositado;
	}
	
	void consultaSaldo(){
		System.out.println("SALDO ATUAL = R$ " + saldo);
	}
	
	boolean verificaUsoChequeEspecial(){
		return saldo < 0;
	}
	
}
