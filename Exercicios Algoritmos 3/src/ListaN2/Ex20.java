package ListaN2;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);	
		
		String login = "";
		int cont = 0,senha1 = 0, senha2 = 0;
		
		
		 System.out.println("Insira seu login :");
		 login = entrada.next();
		 System.out.println("Insira sua senha :");
		 senha1 = entrada.nextInt();
		 
		 do {
			 
			System.out.println("\nUsuário " +login);
			 System.out.println("\nInsira sua senha: ");
			 senha2 = entrada.nextInt();
			 
			cont++;
			if (senha2 != senha1) {
				System.out.println("Senha incorreta! Tente Novamente!");
			}
			
		   if(cont == 3) {
			   System.out.println("Acesso bloqueado, procure um moderador!!!");
			   System.exit(0);
		   }	
		 } 
		 
		while(senha2 != senha1);
			
		 
		
		System.out.println("-----Bem vindo ao sistema!-----");
		
		
		
		
entrada.close();		
	}

}
