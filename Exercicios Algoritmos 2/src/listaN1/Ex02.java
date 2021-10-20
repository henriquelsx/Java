package listaN1;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Insira seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();
		
		System.out.println("O usuário " + nome + " informou que tem " + idade + " anos.");
		
		entrada.close();
	}

}
