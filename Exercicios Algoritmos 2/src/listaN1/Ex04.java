package listaN1;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
double x, y;
double quociente;
double resto;

		System.out.println("Insira o valor de X: ");
		x = entrada.nextDouble();
		System.out.println("Insira o valor de Y: ");
		y = entrada.nextDouble();
		
		quociente = x/y;
		resto = x%y;
		
		System.out.println(x + " dividido por " + y + " = " + quociente);
		System.out.println("O resto da divisao é: " + resto);
		
		
		
		
		
		entrada.close();	

	}

}
