package HenriqueN1;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		double nota1, nota2, mediaAtv, mediaFinal;
		
		System.out.println("Insira a nota 1: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Insira a nota 2: ");
		nota2 = entrada.nextDouble();
		
		System.out.println("Insira a média das atividades: ");
		mediaAtv = entrada.nextDouble();
		
		mediaFinal= (nota1 + nota2) / 2 *0.7 + mediaAtv*0.3;
		
		  if(mediaFinal > 10 || mediaFinal < 0) {
		        System.out.println("Nota inválida!");		
		        } else if(mediaFinal >=9) {
		        	System.out.println("Conceito A");
		        	System.out.println("Aprovado !!! ");
		        } else if(mediaFinal >=7.5) {
		        		System.out.println("Conceito B");
		        		System.out.println("Aprovado !!");
		        } else if(mediaFinal >=6) {
		    		System.out.println("Conceito C ");
		    		System.out.println("Aprovado !");
		        } else if(mediaFinal >=4) {
		    		System.out.println("Conceito D");
		    		System.out.println("Reprovado!");
		        }else if(mediaFinal < 4) {
		    		System.out.println("Conceito E");
		    		System.out.println("Reprovado!!!");
		        }
				
		
		System.out.println("Média Final: " +mediaFinal);
		
	entrada.close();	
		
	}

}
