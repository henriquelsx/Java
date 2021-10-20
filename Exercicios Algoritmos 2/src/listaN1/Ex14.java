package listaN1;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float x,y;
		double eq;
		
		System.out.println("Informe o valor de X: ");
		x = entrada.nextFloat();
	
		System.out.println("Informe o valor de Y: ");
		y = entrada.nextFloat();
		
		eq = 2 * Math.sqrt(3*x+30)/3 + Math.pow((y -32), 4);
		
		System.out.print("O resultado da equação é: " + eq);
		
		
		
		entrada.close();
		
		
		
	}
	
	
	

}
