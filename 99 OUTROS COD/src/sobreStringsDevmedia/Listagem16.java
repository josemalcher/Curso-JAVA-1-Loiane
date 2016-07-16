package sobreStringsDevmedia;

public class Listagem16 {
	/*
	 * Concatenando strings
	 * 
	 * O m�todo concat concatena dois objetos string e retorna um novo objeto
	 * string que cont�m os caracteres das duas strings originais.
	 * 
	 * Listagem 16: Exemplo do m�todo concat
	 */
	public static void main(String[] args) {
		String nome =  "Jos�";
		String sobrenome = "Malcher";
		
		System.out.printf("Nome = %s \nSobrenome = %s \n \n",nome, sobrenome);
		
		System.out.printf("Resultado do nome.concat(sobrenome) = %s\n", nome.concat(sobrenome));
		
		//Strings s�o IMUTAVEIS por isso que ir� imprimir a string original
		System.out.printf("A vari�vel \"nome\" depois da concatena��o = [%s]\n ",nome);
	}
}
