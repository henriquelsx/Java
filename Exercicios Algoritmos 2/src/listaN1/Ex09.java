package listaN1;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);

double fahrenheit, celsius;
		
		System.out.println("Informe a temperatura em Fahrenheit: ");
		fahrenheit = entrada.nextDouble();
		
		celsius = 5.0 *(fahrenheit - 32.0)/9.0;
		
		System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
		System.out.println("Temperatura em Celsius: " + celsius);
		
	entrada.close();	
		
		
		
	}

}
