package listaN1;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		int idade;
		String nome;
		
		System.out.println("Insira seu nome: ");
		nome = entrada.nextLine();
		
		System.out.println("Insira sua idade: ");
		idade = entrada.nextInt();

		if(idade>18) {System.out.println("O usuário é maior de idade!");
		} else {System.out.println("O usuário é menor de idade!");
		}
		
	entrada.close();
	
	
	
	}
	
		}
