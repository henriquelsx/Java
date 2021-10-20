package listaN1;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
	int codigo;
	
	System.out.println("Insira o código do produto :");
	codigo = entrada.nextInt();
	
	switch (codigo){
	case 1 :
	System.out.println("Alimento não-perecível");	
	break;
	case 2,3,4 :
		System.out.println("Alimento perecível ");	
		break;	
	case 5,6 :
		System.out.println("Vestuário");	
		break;	
	case 7 :
		System.out.println("Higiene Pessoal");	
		break;
	case 8,9,10,11,12,13,14,15 :
		System.out.println("Limpeza e untensílios domésticos");	
		break;	
    default: System.out.println("Código inválido!");
		
		
		
	}	
		
		
	entrada.close();	
	}

}
