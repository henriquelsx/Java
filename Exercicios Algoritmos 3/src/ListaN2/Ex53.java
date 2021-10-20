package ListaN2;

import java.util.Random;
import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int tam = 10;
		int A[] = new int[tam];
		int B[] = new int[tam];
		int soma[] = new int[tam];
		int interseccao[] = new int[tam];
		int diferenca[] = new int[tam];
		int intercalacao[] = new int[A.length + B.length];
		int limiteSuperior, limiteInferior;

		do {
			System.out.println("Informe o limite Inferior: ");
			limiteInferior = entrada.nextInt();

			System.out.println("Informe o limite Superior: ");
			limiteSuperior = entrada.nextInt();

			if (limiteInferior > limiteSuperior) {
				System.out.println("O limite inferior deve ser MENOR que o limite superior. Tente novamente!\n");
			}

		} while (limiteInferior > limiteSuperior);

		for (int i = 0; i < A.length; i++) {
			A[i] = sorteia(limiteInferior, limiteSuperior);
		}

		System.out.println("Vetor A: ");
		imprimeVetor(A);

		for (int i = 0; i < B.length; i++) {
			B[i] = sorteia(limiteInferior, limiteSuperior);
		}

		System.out.println("\nVetor B: ");
		imprimeVetor(B);

		/*
		 * C�lculo do Vetor SOMA;
		 */
		for (int i = 0; i < soma.length; i++) {
			soma[i] = A[i] + B[i];
		}

		System.out.println("\nVetor Soma: ");
		imprimeVetor(soma);

		/*
		 * C�lculo do Vetor intersec��o
		 */

		int posIntersec = 0;
		for (int i = 0; i < A.length; i++) {
			boolean achei = false;
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					for (int k = 0; k < posIntersec; k++) {
						if (A[i] == interseccao[k]) {
							achei = true;
						}
					}

					if (achei == false) {
						interseccao[posIntersec] = A[i];
						posIntersec++;
					}
				}
			}
		}

		System.out.println("Vetor Intersec��o: ");
		for (int i = 0; i < posIntersec; i++) {
			System.out.print(interseccao[i] + "\t");
		}

		/*
		 * C�lculo do Vetor Diferen�a
		 */

		int posDiff = 0;
		for (int i = 0; i < A.length; i++) {
			boolean achei = false;
			for (int j = 0; j < B.length; j++) {
				if (A[i] == B[j]) {
					achei = true;
				}
			}

			boolean jaExiste = false;
			if (achei == false) {
				for (int k = 0; k < posDiff; k++) {
					if (A[i] == diferenca[k]) {
						jaExiste = true;
					}
				}

				if (jaExiste == false) {
					diferenca[posDiff] = A[i];
					posDiff++;
				}
			}
		}

		System.out.println("\nVetor Diferen�a: ");
		for (int i = 0; i < posDiff; i++) {
			System.out.print(diferenca[i] + "\t");
		}
		
		/*
		 * C�lculo do Vetor Intercala��o
		 */

		int posA = 0, posB = 0;
		for(int posIntercala = 0; posIntercala < intercalacao.length; posIntercala++)
		{
			if(posIntercala % 2 == 0)
			{
				intercalacao[posIntercala] = A[posA];
				posA++;
			}
			else{
				intercalacao[posIntercala] = B[posB];
				posB++;
			}
		}
		
		System.out.println("\nVetor Intercala��o: ");
		imprimeVetor(intercalacao);
	}

	public static int sorteia(int limiteInferior, int limiteSuperior) {
		Random rd = new Random();
		return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
	}

	public static void imprimeVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "\t");
		}

		System.out.println();
	}

}


