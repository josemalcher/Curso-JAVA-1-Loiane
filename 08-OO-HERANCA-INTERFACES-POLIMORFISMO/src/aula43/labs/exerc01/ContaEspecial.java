package aula43.labs.exerc01;

public class ContaEspecial extends Conta{

	private double limite;

	public boolean sacar(double quantidadeSACAR){
		
		double saldoComLimete = this.getSaldo() + this.limite;
		
		if((saldoComLimete - quantidadeSACAR) >= 0){
			this.setSaldo(this.getSaldo()-quantidadeSACAR);
			
			return true;
		}
		
		
		return false;
	}
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		String s = "ContaEspecial [limite=" + limite + "]" +
				" \n [ " + super.toString() + " "; 
		return s;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
	
	
}
