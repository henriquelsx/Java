package ListaN2;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
int vetor [] = new int [10];		
int posMaior=0, posMenor=0;
		
	for (int i=0; i<vetor.length; i++) {
		
		System.out.println("Por favor, informe o elemento " +(i+1) + " do vetor: ");
		vetor [i] = entrada.nextInt();
		
		if ( i == 0 ) {
			posMaior = i;
			posMenor = i;
			
		}
		if (vetor[i]> vetor[posMaior]) {
			
			posMaior = i;
		}
		if (vetor[i] < vetor[posMenor]) {
			
			posMenor = i;
		}
		
	}	
		
		
	System.out.println("O maior elemento do vetor � o " +vetor[posMaior] + " que est� na posi��o: " +posMaior );	
	System.out.println("O menor elemento do vetor � o " +vetor[posMenor] + " que est� na posi��o: " +posMenor );		
}
	
	
	
	
}