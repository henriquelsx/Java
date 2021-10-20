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
		
		System.out.println("Informe o primeiro número: ");
		A = entrada.nextInt();
		
		System.out.println("Informe o primeiro número: ");
		B = entrada.nextInt();
		
		divisao = A/B;
		resto = A%B;
		
		if (resto == 0) {System.out.println("Número " + A + " é dívisivel por " + B);
		} else if (resto != 0) { System.out.println("Número " + A + " não é dívisivel por " + B);
		}
		
		System.out.println("Resultado da divisão : " + divisao);
		
	entrada.close();	
	}

}
