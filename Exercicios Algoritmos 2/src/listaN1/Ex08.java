package listaN1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double pre�o;
		double total;
		// distribuidor 12% + impostos 30% = 42%
	
		System.out.println("Insira o custo de f�brica:");
		pre�o = entrada.nextDouble();
		
	total = (pre�o*1.42);
		
	System.out.println("O valor final do carro ser�: " + total);
	
	
	entrada.close();
		
	}

}
