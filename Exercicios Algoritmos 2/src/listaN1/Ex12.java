package listaN1;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double a1;
		double an;
		double n;
		double razao;
		
		System.out.println("Informe seu primeiro termo : ");
		a1 = entrada.nextDouble();
		
		System.out.println("Informe sua raz�o: ");
		razao = entrada.nextDouble();
		
		System.out.println("Qual termo voc� gostaria de descobrir da progress�o aritm�tica? ");
		n = entrada.nextDouble();
		
		an = a1+ (n-1)*razao;
		
		System.out.println("O " + n + "� termo da progress�o aritmetica �: " + an);
		
		entrada.close();	
	}

}
