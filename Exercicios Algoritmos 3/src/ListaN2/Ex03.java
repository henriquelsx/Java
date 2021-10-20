package ListaN2;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		int c=1, quantNumeros, numero,maior = 0,menor = 1;
		double soma = 0, media;
		
		
		System.out.println("Insira quantos números quer calcular ");
		quantNumeros = entrada.nextInt();
		
		
		while (c<= quantNumeros)
		{
			System.out.println("Digite o número "+c+ ":");
			numero = entrada.nextInt();
			
			soma = soma+numero;

			c++;
			if(c == 1)
			{
				maior = numero;
				menor = numero;
			}
			
			if(numero > maior)
			{
				maior = numero;
			}
			
			if(numero < menor){
				menor = numero;
			}
		}
		
		media = soma/quantNumeros;
		System.out.println("A média dos números é : " + media);
		System.out.println("A número maior é : " + maior);
		System.out.println("A número menor é : " + menor);
		
		
		
		
		
		
		entrada.close();
	}

}
