package listaN1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		double produto;
		double desconto;
		double valor;
		double descontado;
		
		System.out.println("Insira o valor total do produto: ");
		produto = entrada.nextDouble();
		
		System.out.println("Insira o desconto: ");
		desconto = entrada.nextDouble();
		
		valor = produto * (desconto/100);
		descontado = produto-valor;
		
		System.out.println("O novo valor do produto é: " + descontado);
		
		entrada.close();

	}

	
	}


