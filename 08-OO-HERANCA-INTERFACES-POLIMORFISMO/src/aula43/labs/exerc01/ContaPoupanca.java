package aula43.labs.exerc01;

import java.util.Calendar;

//resolução LOiane
public class ContaPoupanca extends Conta{

	
	private double diaRendimento;

	
	
	public boolean calculoNovoSaldo(double taxaRendimento){
		Calendar hoje = Calendar.getInstance();

		if(diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
			
			this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
			
			return true;
		}
	
		return false;
	}
	
	
	
	@Override
	public String toString() {
		String s = "ContaPoupanca [diaRendimento=" + diaRendimento + " + "
				+ " ; ] \n [" + super.toString() + " ] "; 
		
		return s;
		
	}

	public double getDiaRendimento() {
		return diaRendimento;
	}

	public void setDiaRendimento(double diaRendimento) {
		this.diaRendimento = diaRendimento;
	}
	
	
	
}
