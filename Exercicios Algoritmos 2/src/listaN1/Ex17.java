package listaN1;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float dolar, convertido;
		float reais;
		
		System.out.println("Insira quantos dólares deseja converter em reais: ");
		dolar = entrada.nextFloat();
		
		convertido = (float) (dolar*5.75);
		
		System.out.println(convertido + " R$");
		
		entrada.close();
		

	}

}
