package listaN1;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double salario;
		int codigo;
		double escrit,secret,caixa,gerente,diretor;
		
		System.out.println(" Insira o sal�rio correspondente ao cargo: ");
		salario = entrada.nextDouble();
		System.out.println(" 1 - Escritu�rio");
		System.out.println(" 2 - Secret�rio");
		System.out.println(" 3 - Caixa");
		System.out.println(" 4 - Gerente");
		System.out.println(" 5 - Diretor");
		codigo = entrada.nextInt();
		
		escrit = salario*0.5;
		secret = salario*0.35;
		caixa = salario*0.2;
		gerente = salario*0.1;
		diretor = salario;
		
		switch (codigo){
		case 1 :
		System.out.println("O valor do aumento � de : " + escrit);	
		break;
		case 2 :
			System.out.println("O valor do aumento � de : " + secret);	
			break;
		case 3 :
			System.out.println("O valor do aumento � de : " + caixa);	
			break;	
		case 4 :
			System.out.println("O valor do aumento � de : " + gerente);	
			break;	
		case 5 :
			System.out.println("O valor do aumento � de : " + diretor);	
			break;	
		default: System.out.println("Esse c�digo n�o est� dispon�vel!");	
			
		
		}
		entrada.close();
	}

}
