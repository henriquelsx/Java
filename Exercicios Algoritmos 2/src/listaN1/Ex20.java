package listaN1;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
	    
		float areatotal, areaconst, areanconst, imposto1, imposto2, total;
		
		System.out.println("Insira a �rea total do terreno: ");
		areatotal = entrada.nextFloat();
		
		System.out.println("Insira a �rea constru�da do terreno: ");
		areaconst = entrada.nextFloat();

		imposto1 = (areatotal-areaconst)*5;
		imposto2 = (float) (areatotal*3.80);
		total = imposto1 + imposto2;
		
		System.out.println("Imposto sobre a �rea total: " + imposto2 +"\nImposto sobre a �rea constru�da: " + imposto1 + "\nImposto total a ser pago: "+ total );
		
		
		
		entrada.close();
	}

}
