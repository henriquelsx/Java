package listaN1;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		double x1,x2,y1,y2;
		double A,B;
		double distEuclid;
		
		System.out.println("Insira a longitude da primeira localização: ");
		x1 = entrada.nextDouble();
		
		System.out.println("Insira a latitude da primeira localização: ");
		x2 = entrada.nextDouble();
				
		System.out.println("Insira a longitude da segunda localização: ");
		y1 = entrada.nextDouble();
		
		System.out.println("Insira a latitude da segunda localização: ");
		y2 = entrada.nextDouble();
	
		
		A = Math.pow ((x2-x1), 2);
		B = Math.pow ((y2-y1), 2);
		
		distEuclid = Math.sqrt(A + B);
		
		System.out.println("A distância euclidiano entre os dois pontos é de: " + distEuclid);
		
		entrada.close();
	}

}
