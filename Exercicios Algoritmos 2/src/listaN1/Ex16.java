package listaN1;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int A,B,C;
		double R,S;
		double D;
		
		System.out.println("Insira o valor de A: ");
		A = entrada.nextInt();
		
		System.out.println("Insira o valor de B: ");
		B = entrada.nextInt();
		
		System.out.println("Insira o valor de C: ");
		C = entrada.nextInt();
		
		R = Math.pow((A+B), 2);
		S = Math.pow((B+C), 2);
		D = R+S/2;
		
		System.out.println("O resultado da expressão é: " + D);
		
		entrada.close();

	}

}
