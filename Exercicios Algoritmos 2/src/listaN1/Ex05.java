package listaN1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double area;
		double base, altura;
		double perimetro;
		
		System.out.println("Insira a base do ret�ngulo: ");
		base = entrada.nextInt();
		
		System.out.println("Insira a altura do ret�ngulo: ");
		altura = entrada.nextInt();
		
		area = base * altura;
		perimetro = 2* (base + altura);
		
		System.out.println("�rea do ret�ngulo : " + area);
		System.out.println("Per�metro do ret�ngulo : " + perimetro);
	
		entrada.close();
	}

}
