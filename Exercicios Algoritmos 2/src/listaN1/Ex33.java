package listaN1;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
	int opc;
	double peso;
	double pesofinal = 0;
	
	System.out.println("Insira o peso: ");
	peso = entrada.nextDouble();
	
	System.out.println("Insira a op��o:");
	System.out.println("Merc�rio = 1");
	System.out.println("V�nus = 2");
	System.out.println("Marte = 3");
	System.out.println("J�piter = 4");
	System.out.println("Saturno = 5");
	System.out.println("Urano = 6");	
	opc = entrada.nextInt();	
		
	if (opc == 1)
	{
		pesofinal = peso * 0.37 ;
	}
	if (opc == 2)
	{
		pesofinal = peso * 0.88 ;
	}	
	if (opc == 3)
	{
		pesofinal = peso * 0.38 ;
	}	
	if (opc == 4)
	{
		pesofinal = peso * 2.64 ;
	}	
	if (opc == 5)
	{
		pesofinal = peso * 1.15 ;
	}	
	if (opc == 6)
	{
		pesofinal = peso * 1.17 ;
	}	
	System.out.println("O peso ser�:" + pesofinal);
		
	entrada.close();	
		
		
	}

}
