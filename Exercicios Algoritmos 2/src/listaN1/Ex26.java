package listaN1;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		int A;
		int B;
		double divisao;
		double resto;
		
		System.out.println("Informe o primeiro n�mero: ");
		A = entrada.nextInt();
		
		System.out.println("Informe o primeiro n�mero: ");
		B = entrada.nextInt();
		
		divisao = A/B;
		resto = A%B;
		
		if (resto == 0) {System.out.println("N�mero " + A + " � d�visivel por " + B);
		} else if (resto != 0) { System.out.println("N�mero " + A + " n�o � d�visivel por " + B);
		}
		
		System.out.println("Resultado da divis�o : " + divisao);
		
	entrada.close();	
	}

}
