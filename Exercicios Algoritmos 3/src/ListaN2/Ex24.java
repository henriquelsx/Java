package ListaN2;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);
		
		int n1,n2,c,soma = 0;
		
		
	System.out.println("Insira o número inicial");	
	n1 = entrada.nextInt();	
	System.out.println("Insira o número final");		
	n2 = entrada.nextInt();	
	
		
		for (c = n1; c <= n2; c++) {
		soma += n1*c;
			
			
		}
		
		System.out.println("Numero inicial: " +n1+ "\nNumero final: "+n2);
		System.out.println("Soma dos números entre : " + n1 + " e " +n2+ " = " +soma);
		
	entrada.close();	
	}

}
