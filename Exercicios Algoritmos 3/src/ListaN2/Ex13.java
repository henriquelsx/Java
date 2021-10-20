package ListaN2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);		
		
		int numero;
		
		
	System.out.println("Informe um número: ");
		 numero = entrada.nextInt();
		 
		 while (numero < 1 || numero > 5)
		 {
			 System.out.println("Entrada inválida, tente novamente, informe um número entre 1 e 5: ");
			 numero = entrada.nextInt();
		 }
		System.out.println("Parabéns o número digitado foi " +numero); 
		
entrada.close();
	}

}
