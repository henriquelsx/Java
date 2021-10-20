package listaN1;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);
		
int idade;
		
	System.out.println("Insira a idade: ");
		idade = entrada.nextInt();
		
		
		   if(idade < 0) {
		        System.out.println("Idade inválida!");		
		        } if(idade >=55) {
		        	System.out.println("Idoso"); 	
		        } if(idade < 55 && idade >= 20) {
		        	System.out.println("Adulto"); 	
		        } if(idade >=12 && idade <= 18) {
		        	System.out.println("Adolescente"); 	
		        } if(idade <= 11 && idade>= 3) {
		        	System.out.println("Criança"); 	
		        } if(idade<=2) {
		        	System.out.println("Recém - nascido"); 	
		        } 
		
		
			
		
		
	entrada.close();
	}

}
