package ListaN2;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
	
		int x,y;
		double pow = 1;
		
		System.out.println("Informe o número a ser calculado:");
		x =  entrada.nextInt();
		System.out.println("Informe a potência: ");
		y = entrada.nextInt();
		pow=x;
		for (int c = 1; c < y; c++) {
			pow *= x;
		}
		 System.out.println("RESULTADO de " +x+ " elevado á " +y+ " = " +pow);
		
		
		
entrada.close();		
	}

}
