package ListaN2;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);
		
int c,par = 0,impar = 0;
		
System.out.println("Informe o valor de N");
int n = entrada.nextInt();

for(c = 1; c<=n; c++ ) {
	if(c%2==0) {
	par = c;	
	System.out.println("Número par: "+par);
	}
	else {
	impar = c;
	System.out.println("Número ímpar: "+impar);
	}
	

}	
		
		
entrada.close();	
		
	}

}
