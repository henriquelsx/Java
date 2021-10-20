package listaN1;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double salario;
		int codigo;
		double escrit,secret,caixa,gerente,diretor;
		
		System.out.println(" Insira o salário correspondente ao cargo: ");
		salario = entrada.nextDouble();
		System.out.println(" 1 - Escrituário");
		System.out.println(" 2 - Secretário");
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
		System.out.println("O valor do aumento é de : " + escrit);	
		break;
		case 2 :
			System.out.println("O valor do aumento é de : " + secret);	
			break;
		case 3 :
			System.out.println("O valor do aumento é de : " + caixa);	
			break;	
		case 4 :
			System.out.println("O valor do aumento é de : " + gerente);	
			break;	
		case 5 :
			System.out.println("O valor do aumento é de : " + diretor);	
			break;	
		default: System.out.println("Esse código não está disponível!");	
			
		
		}
		entrada.close();
	}

}
