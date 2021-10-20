package listaN1;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double preço;
		double total;
		// distribuidor 12% + impostos 30% = 42%
	
		System.out.println("Insira o custo de fábrica:");
		preço = entrada.nextDouble();
		
	total = (preço*1.42);
		
	System.out.println("O valor final do carro será: " + total);
	
	
	entrada.close();
		
	}

}
