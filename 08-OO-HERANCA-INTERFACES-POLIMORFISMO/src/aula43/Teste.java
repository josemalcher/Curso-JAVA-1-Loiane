package aula43;

public class Teste {
	public static void main(String[] args) {
		Aluno aluno01 = new Aluno();
		aluno01.setCurso("Analise de sistemas");
		double[] notas = {10,8,7,5};
		aluno01.setNotas(notas);
		System.out.println(aluno01);
		
		//método equals
		
		String s1 = "abcd";
		String s2 = "abcD";
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		Aluno aluno02 = new Aluno();
		aluno02.setCurso("Eng de sistemas");
		double[] notas02 = {5,10,4,10};
		aluno02.setNotas(notas02);
		System.out.println(aluno02);
		
		System.out.println(aluno01 == aluno02);
		//COMPARANDO OS ATRIBUTOS
		System.out.println(aluno01.equals(aluno02));
		
		
		
		
		
	}
}
