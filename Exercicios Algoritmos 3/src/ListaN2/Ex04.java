package ListaN2;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);		
		
int idade;
String nome = "";
String opcao = "";



while (!opcao.equalsIgnoreCase("N")) {


	System.out.println("Insira o nome do usu�rio: ");
	nome = entrada.next();
	System.out.println("Insira a idade do usu�rio: ");
	idade = entrada.nextInt();
	System.out.println("O usu�rio " +nome+ " tem " +idade+ " anos de vida");

	System.out.println("\nDeseja continuar? \n S - Continuar \n N - Sair ");
	opcao = entrada.next();
	
	
	
}



entrada.close();
	}

}
