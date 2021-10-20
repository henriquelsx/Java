package listaN1;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		 
		double raio, perimetro, area;
		 
		 System.out.println("Informe o raio: ");
		 raio = entrada.nextDouble();
		 
		 area = Math.PI * Math.pow(raio, 2.0);
		 perimetro = 2.0 * Math.PI * raio;
		 
		 
		 System.out.println("Área : " + area);
		 System.out.println("Perímetro: " + perimetro);
		
		
		
		
		 entrada.close();
		
		
		
		
		
		
		
		
	}

}
