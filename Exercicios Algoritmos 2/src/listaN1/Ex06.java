package listaN1;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner entrada;
		entrada = new Scanner(System.in);
		
		float salario;
		float salariominimo = 1045;
		float total;
		
		System.out.println(" Insira seu sal�rio: ");
		salario = (float) entrada.nextDouble();
		
		total = salario/salariominimo;
		
		System.out.println("Voc� recebe " + total + " sal�rios m�nimos." );
		
		
		
		
		
		entrada.close();	
	}

}
