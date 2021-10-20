package listaN1;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.println("Informe o número: ");
		numero = entrada.nextDouble();
		
		if (numero > 0) { System.out.println("Número positivo");
		} else if (numero == 0) { System.out.println("Número nulo");
		} else if (numero < 0) { System.out.println("Número negativo");
		}
		
			
			
			
			
		entrada.close();
	}

}
