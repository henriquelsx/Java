package ListaN2;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int num,c, soma = 0;
		
		System.out.println("Informe um n�mero a se verificar se � perfeito: ");
		num = entrada.nextInt();
		
		for(c = 1; c <= num/2; c++)
		{
			if (num % c ==0) {
				soma += c;
			}
		}
		if (num == soma)
		{
			System.out.println(num + " � PERFEITO !");
		} else
		{
			System.out.println(num + " N�O � PERFEITO !");
		}
		
	entrada.close();	
	}

}
