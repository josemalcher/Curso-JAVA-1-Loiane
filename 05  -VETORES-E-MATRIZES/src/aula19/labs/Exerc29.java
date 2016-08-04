package aula19.labs;

public class Exerc29 {
	/*
	 * 29. Ler dois vetores A e B com 10 elementos cada. Construir um vetor C,
	 * sendo este a junção dos dois outros vetores. Os primeiros 10 elementos de
	 * C deverão receber os elementos de A e os últimos elementos C deverão
	 * receber os elementos de B. Desta forma, C deverá ter o dobro de elementos
	 * de A e B, ou seja, 20 elementos.
	 */
	public static void main(String[] args) {
		/*
		Scanner leitor = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Entre com o valor do Vetor A da posição - " + i);
			vetorA[i] = leitor.nextInt();

			vetorC[i] = vetorA[i];
		}

		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Entre com o valor do Vetor B da posição - " + i);
			vetorB[i] = leitor.nextInt();

			vetorC[vetorA.length + i] = vetorB[i];
		}

		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();

		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
		}
		System.out.println();
		*/
		
		//Resolução M.Sc. Omero Francisco B.
		
		int n = 10;
		int vetorA[] = new int[n];
		int vetorB[] = new int[n];
		int vetorC[] = new int[n*2];
		int i, j;
		
		for( i = 0 ; i < n ; i++){
			vetorA[i] = (int)Math.round(Math.random() * 100);
			vetorB[i] = (int)Math.round(Math.random() * 100);
		}
		
		j = n; // primeira posição da segunda metade de C
		
		for(i = 0 ; i < n ; i++){
			vetorC[i] = vetorA[i]; // os primeiros elementos de "c" deverao receber os elementos de "a"
			vetorC[j] = vetorB[i]; // os ultimos elementos "c" deverao receber os elementos de "b"
			j = j + 1; // j++
		}
		
		System.out.printf("Vetor 'a'____________________\n");
	      for (i=0; i < n ; i++) {
	        System.out.printf("%2d ", vetorA[i]);
	      }

	      System.out.printf("\n\nVetor 'b'____________________\n");
	      for (i=0; i < n ; i++) {
	        System.out.printf("%2d ", vetorB[i]);
	      }

	      System.out.printf("\n\nVetor 'c'__________________________________________________\n");
	      System.out.printf("primeiros vetor 'a'__________ ultimos vetor 'b'____________\n");
	      for (i=0; i < ( 2 * n ); i++) {
	        System.out.printf("%2d ", vetorC[i]);
	      }

	      System.out.printf("\n");
		
	}
}
