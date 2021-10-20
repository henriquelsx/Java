package listaN1;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		double um, dois, tres, quatro;
		double mp;
		
		System.out.println("Insira o primeiro valor: ");
		um = entrada.nextDouble();
		
		System.out.println("Insira o segundo valor: ");
		dois = entrada.nextDouble();
		
		System.out.println("Insira o terceiro valor: ");
		tres = entrada.nextDouble();
		
		System.out.println("Insira o quarto valor: ");
		quatro = entrada.nextDouble();
		
		mp = (um*1 + dois*2 + tres*3 + quatro*4)/10;
		
				
		
		System.out.println("A média ponderada é: " + mp);
		
		
		entrada.close();
		
		
	}

}
