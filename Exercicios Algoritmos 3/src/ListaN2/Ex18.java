package ListaN2;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
	int senha, senha1;	
		
	System.out.println("Informe uma senha: ");	
	senha = entrada.nextInt();	
		
	 do{
         System.out.println("\nInforme a senha armazenada: ");
         senha1 = entrada.nextInt();
         
         if(senha == senha1){ 
            System.out.println("Senha correta! Bem vindo ao sistema. "); 
         } else {System.out.println("\nSenha incorreta! Tente novamente");
         }
     } while(senha != senha1);
    	 
     
		
		
		
		
		
		
		
		
	entrada.close();	
	}

}
