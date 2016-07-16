package sobreStringsDevmedia;

public class Listagem16 {
	/*
	 * Concatenando strings
	 * 
	 * O método concat concatena dois objetos string e retorna um novo objeto
	 * string que contém os caracteres das duas strings originais.
	 * 
	 * Listagem 16: Exemplo do método concat
	 */
	public static void main(String[] args) {
		String nome =  "José";
		String sobrenome = "Malcher";
		
		System.out.printf("Nome = %s \nSobrenome = %s \n \n",nome, sobrenome);
		
		System.out.printf("Resultado do nome.concat(sobrenome) = %s\n", nome.concat(sobrenome));
		
		//Strings são IMUTAVEIS por isso que irá imprimir a string original
		System.out.printf("A variável \"nome\" depois da concatenação = [%s]\n ",nome);
	}
}
