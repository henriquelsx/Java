package listaN1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double x1,x2,y1,y2;
		double A,B;
		double distEuclid;
		
		System.out.println("Insira a longitude da primeira localiza��o: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Insira a latitude da primeira localiza��o: ");
		x2 = entrada.nextDouble();
				
		System.out.println("Insira a longitude da segunda localiza��o: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Insira a latitude da segunda localiza��o: ");
		y2 = entrada.nextDouble();
	
		
		A = Math.pow ((x2-x1), 2);
		B = Math.pow ((y2-y1), 2);
		
		distEuclid = Math.sqrt(A + B);
		
		System.out.println("A dist�ncia euclidiano entre os dois pontos � de: " + distEuclid);
		
		entrada.close();
	}

}
