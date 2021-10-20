package ListaN2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);
		
	int n1 = 0,n2 = 0;
	
	System.out.println("Insira N1:");	
	n1 = entrada.nextInt();
	System.out.println("Insira N2:");	
	n2 = entrada.nextInt();
	while(n1 > n2) {
	System.out.println("Insira N1:");	
	n1 = entrada.nextInt();
	System.out.println("Insira N2:");	
	n2 = entrada.nextInt();
	
	if(n1 < n2) {
	System.out.printf("Números entre N1 (%d) e N2 (%n)",n1,n2);	
		
	}
	
	}
		
		
		
		
	System.out.printf("Números entre N1 (%d) e N2 (%n)",n1,n2);		
		
		
		
		
		
		
		
		
entrada.close();		
	}

}
