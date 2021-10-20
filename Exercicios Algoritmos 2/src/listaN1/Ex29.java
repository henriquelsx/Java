package listaN1;

import java.util.Scanner;

public class Ex29 {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Scanner entrada = new Scanner (System.in);
			int idade;
			String nome;
			
			System.out.println("Insira seu nome: ");
			nome = entrada.nextLine();
			
			System.out.println("Insira sua idade: ");
			idade = entrada.nextInt();

			if(idade > 65) {System.out.println(nome +" tem mais de 65 anos!");
			} else if(idade < 12){System.out.println(nome+ " tem menos de 12 anos!");
			} else if(idade >=18 || idade <=64){System.out.println(nome +" é maior de idade!");
			}
			
		entrada.close();	
	}

}
