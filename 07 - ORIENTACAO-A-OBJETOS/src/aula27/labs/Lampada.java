package aula27.labs;

public class Lampada {

	String modelo;
	String tensao;
	String cor;
	String tipoLuz;
	int potencia;
	int garantiaMeses;
	
	String[] tipos;
	
	boolean ligada;
	
	void ligar(){
		ligada = true;
	}
	void desligar(){
		ligada = false;
	}
	
	void mostraEstado(){
		if(ligada){
			System.out.println("Lampada Ligada");
		}else{
			System.out.println("Lampada Desligada");
		}
	}
	void mudarEstado(){
		if(ligada){
			desligar();
		}else{
			ligar();
		}
	}
	
}
