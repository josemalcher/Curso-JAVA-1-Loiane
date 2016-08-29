package aula52.labs;

public class Agenda {
	private Contato[] contatos;

	public Agenda() {
		
		contatos = new Contato[5];
		
	}

	@Override
	public String toString() {
		
		String s = "";
		
		for(Contato c : contatos){
			s += c.toString() + "\n";
		}
		
		return s;
	}
	
	public void adicionarContato(Contato c) throws AgendaCheiaException{
		
		boolean cheia = true;
		for(int i = 0 ; i <contatos.length ; i++){
			if(contatos[i] != null){
				contatos[i] = c;
				cheia = false;
			}
		}
		
		if(cheia){
			throw new AgendaCheiaException();
		}
		
	}
	
	public int consultaContatoNome(String nome) throws ContatoNaoExisteException{
		for(int i = 0; i < contatos.length ; i++){
			if(contatos[i] != null){
				if(contatos[i].getNome().equalsIgnoreCase(nome)){
					return i;
				}
			}
		}
		 throw new ContatoNaoExisteException(nome);
	}
	
	
	
	
	
	
	
	
	
	
	
}
