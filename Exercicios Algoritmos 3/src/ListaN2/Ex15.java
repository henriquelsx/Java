package ListaN2;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);

	int numero, contador,par=0,impar = 0;
	
	do {
	System.out.println("Insira um n�mero:");	
		numero = entrada.nextInt();
		if(numero % 2 == 0 && numero != 0) {
			par++;
			
		}else if (numero != 0) {
			impar++;
		}if(numero < 0){
		System.out.println(" N�mero negativo! Insira um n�mero positivo!");	
		}
	}
	while( numero != 0)	;
		
	System.out.println("N�meros pares: " +par);	
	System.out.println("N�meros �mpares: "+impar);	
	
	}

}
