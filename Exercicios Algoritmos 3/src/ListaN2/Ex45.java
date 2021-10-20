package ListaN2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner (System.in);		
		
	int vetor []= new int [15];
	int raiz []= new int [15];
	
	
	
	
	for (int i = 0; i <vetor.length  ; i++) {
		System.out.println("Insira um número: ");
		vetor[i] = entrada.nextInt();
	
		
		
		
		raiz [i] = (int) Math.sqrt(vetor[i]);
		}
	
	
		System.out.println(Arrays.toString(raiz));
		
	}

}
