package ListaN2;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		Scanner entrada = new Scanner (System.in);
		
		int c=1,nFinal;
		
		System.out.println("Insira o valor inicial");
		c = entrada.nextInt();
		
		System.out.println("Insira o valor final");
		nFinal = entrada.nextInt();
		
		while(c <= nFinal) {
		System.out.printf("\n Contador = %d",c);
		c=c+1;
		}
		
		
		entrada.close();	
	}

}
