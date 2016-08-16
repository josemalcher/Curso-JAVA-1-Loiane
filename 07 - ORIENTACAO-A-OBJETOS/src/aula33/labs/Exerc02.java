package aula33.labs;

public class Exerc02 {
	/*
	 * http://www.loiane.com/2013/10/curso-java-basico-java-se-gratuito/
	 * 
	 * Reescreva os seguintes exercícios, criando todos os atributos do tipo
	 * privado, métodos getters e setters e construtores. Os métodos que serão
	 * utilizados pela classe de teste devem ser públicos. Se necessário, crie
	 * métodos privados como auxiliares para organizar melhor o código fonte
	 * também.
	 * 
	 * 2. Cria uma classe para representar uma conta corrente que possui um
	 * número, um saldo, um status que informa se ela é especial ou não, um
	 * limite. Desenvolva métodos para realizar saque (verificando se o cliente
	 * pode realizar saques), despositar dinheiro, consultar saldo e verificar
	 * se o cliente está usando cheque especial ou não. Desenvolva um programa
	 * para testar essa classe.
	 * 
	 */

	public static void main(String[] args) {
		ContaCorrent conta01 = new ContaCorrent();
		
		conta01.setNumero("1234");
		conta01.setAgencia("321");
		conta01.setEspecial(true);
		conta01.setLimiteEspecial(500);
		conta01.setSaldo(-10);
		
		System.out.println("Saldo da conta " + conta01.getSaldo());
		
		boolean saqueEfetuado = conta01.realizarSaque(10);
		
		if(saqueEfetuado){
			System.out.println("Saque efetuado com sucesso");
			conta01.consultaSaldo();
		}else{
			System.out.println("Não foi possivel realizar saque. Saldo insuficiente");
		}
		
		System.out.println("Deposito de 500 reais");
		
		conta01.depositar(500);
		conta01.consultaSaldo();
		
		//realizar saque
		conta01.realizarSaque(600);
		conta01.consultaSaldo();
		
		
		if(conta01.verificaChequeEspecial()){
			System.out.println("Está usando o cheque especial");
		}else{
			System.out.println("Não esta usando o cheque especial");
		}
	}
}
