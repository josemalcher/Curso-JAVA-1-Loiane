package aula43.labs.exerc01;

public class Conta {
//ContaBancaria
	
	private String nomeCliente;
	private int numConta;
	private double saldo;
	
	//Métodos
	
	public boolean sacar(double quantiaSacar){
		if((saldo - quantiaSacar) >= 0){
			saldo -= quantiaSacar;
			return true;
		}
		return false;
	}
	public void depositar(double quantiaDEpositar){
		this.saldo += quantiaDEpositar;
	}
	
	@Override
	public String toString() {
		return "Conta [nomeCliente=" + nomeCliente + ", numConta=" + numConta + ", saldo=" + saldo + "]";
	}
	
	
	
/*	
	public Conta() {
		//super();
	}



	public Conta(String nomeCliente, int numConta, double saldo) {
		//super();
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}*/



	
	public String getNomeCliente() {
		return nomeCliente;
	}



	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}



	public int getNumConta() {
		return numConta;
	}



	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
	
}
