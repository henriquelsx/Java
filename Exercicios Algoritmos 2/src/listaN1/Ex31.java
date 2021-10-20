package listaN1;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a nota: ");
		
		double nota = entrada.nextDouble();
		

		
		
        if(nota > 10 || nota < 0) {
        System.out.println("Nota inválida!");		
        } else if(nota >=9) {
        	System.out.println("A \nParabéns! Aprovado!"); 	
        } else if(nota >=7) {
        	System.out.println("B \nMuito Bem! Aprovado!"); 	
        } else if(nota >=5) {
        	System.out.println("C \nRecuperação."); 	
        } else if(nota < 4.9) {
        	System.out.println("D \nReprovado!"); 	
        } 
        
		

        
        
System.out.println("Fim");       
entrada.close();
		
		
		
		
		
		
		
	}

}
