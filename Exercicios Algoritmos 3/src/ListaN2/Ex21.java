package ListaN2;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);	
		
	int c;
	String nome = "";
	
	System.out.println("Qual seu nome? ");
	nome = entrada.nextLine();
	
	for(c=1; c<=100; c++)
	{
		System.out.println(c+" - "+nome);
	}
	
	
	entrada.close();	
	}

}
