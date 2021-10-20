package ListaN2;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
	int vetor[] = new int [10];
	int i,maior = 0;
	
	for (i = 0; i< vetor.length; i++) {
	System.out.println("Insira um número: ");
	vetor[i] = entrada.nextInt();}
	for (int a = 0; a< vetor.length; a++) {
	if(vetor[a]> 50) {
		System.out.println(vetor [a] + " - na posição - "+ a);
	}
	}
	
	
	
	}

}
