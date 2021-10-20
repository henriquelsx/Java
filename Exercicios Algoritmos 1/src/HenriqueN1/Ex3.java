package HenriqueN1;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		double x0, y0, a, b, c;
		double ponto;
		
		System.out.println("Insira a coordenada x0 do ponto: ");
		x0 = entrada.nextDouble();
		
		System.out.println("Insira a coordenada y0 do ponto: ");
		y0 = entrada.nextDouble();
		
		System.out.println("Insira o coeficiente a da reta: ");
		a = entrada.nextDouble();
		
		System.out.println("Insira o coeficiente b da reta: ");
		b = entrada.nextDouble();
		
		System.out.println("Insira o coeficiente c da reta: ");
		c = entrada.nextDouble();
		
		ponto = ((a*x0) + (b*y0) + c) / Math.sqrt(	  (Math.pow(a, 2) + Math.pow(b, 2))   );
	
		
		System.out.println("A distância entre o ponto e a reta é de: " + ponto);
		
		
		
		
		
		
		
	entrada.close();	
	}

}
