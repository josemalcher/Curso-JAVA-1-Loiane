package aula24.labs;

public class Exerc05 {
	/*
	 * 5. Cria uma classe para representar uma conta corrente que possui um
	 * número, um saldo, um status que informa se ela é especial ou não, um
	 * limite.
	 */
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		conta.numero = "123";
		conta.agencia = "4321";
		conta.especial = true;
		conta.limiteEspecial = 1000;
		conta.saldo = 310;

		System.out.println("Saldo da conta " + conta.numero + " = " + conta.saldo);
	}
}
