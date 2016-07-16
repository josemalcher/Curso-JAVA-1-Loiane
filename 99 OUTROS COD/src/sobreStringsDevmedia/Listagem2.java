package sobreStringsDevmedia;

public class Listagem2 {
	public static void main(String[] args) {
		/*
		 * Na classe String � poss�vel criar o objeto e passar alguns
		 * par�metros, que s�o oferecidos pelos construtores da classe, o que
		 * ajuda na inicializa��o dos objetos String. Abaixo � mostrado diversas
		 * formas de como podemos instanciar novos objetos String e passar
		 * par�metros utilizando os construtores.
		 * 
		 * Listagem 2: Criando construtores e vari�veis de refer�ncia
		 */

		String nome = new String("Jos� Malcher Junior");
		String sobrenome = new String();
		String nomeCompleto = new String(nome);

		char[] iniciaisMeses = { 'j', 'f', 'm', 'a', 'm', 'j', 'j', 'a', 's', 'o', 'n', 'd' };
		String meses = new String(iniciaisMeses);

		System.out.printf("NOME = %s\n ", nome);
		System.out.printf("Sobrenome %s\n", sobrenome);
		System.out.printf("Nome Completo %s\n ", nomeCompleto);
		System.out.printf("Caracteres dos meses %s\n", meses);
	}
}
