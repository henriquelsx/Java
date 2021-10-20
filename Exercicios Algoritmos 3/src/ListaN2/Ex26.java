package ListaN2;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner (System.in);
 int c,nota1 = 0,nota2 = 0;
 double media;
 
 
 for(c = 1; c<=5; c++)
 {

	 
System.out.println("\nALUNO " +c);	 
 System.out.println("Insira a nota 1: ");
	nota1 = entrada.nextInt();
System.out.println("Insira a nota 2: ");	
	nota2 = entrada.nextInt();
	if(c==1) {
		media = (nota1+nota2)/2;
		System.out.println("Média do primeiro aluno: " +media);	
	} else if(c==2) {
		media = (nota1+nota2)/2;
		System.out.println("Média do segundo aluno: " +media);
	} else if(c==3) {
		media = (nota1+nota2)/2;
		System.out.println("Média do segundo aluno: " +media);
	} else if(c==4) {
		media = (nota1+nota2)/2;
		System.out.println("Média do segundo aluno: " +media);
	} else if(c==5) {
		media = (nota1+nota2)/2;
		System.out.println("Média do segundo aluno: " +media);
	} 
		
 }	
 }
		
		
	

}
