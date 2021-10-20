package HenriqueN1;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int lados,ladosdif;
		
		
		 System.out.println("Insira quantos lados tem o polígono: ");
		 lados = entrada.nextInt();
		 
		 ladosdif = lados * (lados - 3) / 2;
		
		 
		 System.out.println("Número de diagonais diferentes : " +ladosdif);
		 
		 
		entrada.close();	
	}

}
