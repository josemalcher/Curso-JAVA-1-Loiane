package aula33.labs;

public class Lampada {
	private String modelo;
	private String marca;
	private int potencia;
	private String[] tipos;
	private boolean tipoAbajur;
	private boolean ligada;
	
	public Lampada() {
	
	}
	
	public Lampada(String modelo, String marca, int potencia, String[] tipos, boolean tipoAbajur, boolean ligada) {
		//super();
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.tipos = tipos;
		this.tipoAbajur = tipoAbajur;
		this.ligada = ligada;
	}
	
	public void mostrarEstado(){
		if(isLigada()){
			System.out.println("Lampada está ligada");
		}else{
			System.out.println("Lampada DESLIGADA");
		}
	}
	
	public void ligar(){
		setLigada(true);
	}
	public void desligar(){
		setLigada(false);
	}
	
	public void mudarEstado(){
		if(isLigada()){
			desligar();
		}else{
			ligar();
		}
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String[] getTipos() {
		return tipos;
	}
	public void setTipos(String[] tipos) {
		this.tipos = tipos;
	}
	public boolean isTipoAbajur() {
		return tipoAbajur;
	}
	public void setTipoAbajur(boolean tipoAbajur) {
		this.tipoAbajur = tipoAbajur;
	}
	public boolean isLigada() {
		return ligada;
	}
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
	
	
	
}
