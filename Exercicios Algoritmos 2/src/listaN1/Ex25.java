package listaN1;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double numero;
		
		System.out.println("Informe o n�mero: ");
		numero = entrada.nextDouble();
		
		if (numero > 0) { System.out.println("N�mero positivo");
		} else if (numero == 0) { System.out.println("N�mero nulo");
		} else if (numero < 0) { System.out.println("N�mero negativo");
		}
		
			
			
			
			
		entrada.close();
	}

}
