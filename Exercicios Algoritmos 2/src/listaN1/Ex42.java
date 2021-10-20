package listaN1;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		float a,b,c,x;
		int codigo;
		float cod1,cod2,cod3,cod4;
		
		System.out.println("Insira o valor de A: ");
		a = entrada.nextFloat();
		System.out.println("Insira o valor de B: ");
		b = entrada.nextFloat();
		System.out.println("Insira o valor de C: ");
		c = entrada.nextFloat();
		System.out.println("Insira o valor de X: ");
		x = entrada.nextFloat();
		System.out.println("Insira o codigo da operação que deseja fazer: ");
		codigo = entrada.nextInt();
		
		cod1 = (float) (((Math.pow(a*x, 2)) - b * x + c) / (b*x) - c);
		cod2 = (float) (Math.pow((a*x), 2)+ b*x+c);
		cod3 = (float) (a*x + Math.pow(c*x, 3)/ 4*x);
		cod4 = (float) (Math.pow(b*x, 4)-1);
		
		switch (codigo){
		case 1 :
			if (b == 0 ) {System.out.println("Ocorrerá divisão por zero!");}
			if (x == 0 ) {System.out.println("Ocorrerá divisão por zero!");}
		System.out.println("O resultado da operação é "+ cod1);	
		break;
		case 2 :
			System.out.println("O resultado da operação é "+ cod2);	
			break;
		case 3 :
			if(x == 0) {System.out.println("Ocorrerá divisão por zero!");}
			System.out.println("O resultado da operação é "+ cod3);	
			break;
		case 4 :
			System.out.println("O resultado da operação é "+ cod4);	
			break;
		}
		
		
		
	entrada.close();	
	}

}
