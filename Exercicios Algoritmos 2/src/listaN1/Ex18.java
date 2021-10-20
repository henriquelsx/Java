package listaN1;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		float A,B;
		
		System.out.println("Insira o valor de A: ");
		A = entrada.nextFloat();
		
		System.out.println("Insira o valor de B: ");
		B = entrada.nextFloat();
		
		System.out.print("Valor de A: " + B + "\nValor de B: "+ A);
		
		entrada.close();
	}

}
