package ListaN2;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada=new Scanner(System.in);
		
		int menorIdade=0,adulto=0,idoso=0,idade,cont=1;
		
		
		while (cont<=10){
		System.out.println("Informe a idade da pessoa "+ cont);
		idade = entrada.nextInt();
		
		while(idade<=0)
		{
			System.out.println("Idade Inválida, Iforme novamente a idade da pessoa " +cont);
			idade = entrada.nextInt();
		}
		
			 if(idade<=18)
			 {
				 menorIdade++;
			 }
			 else if(idade<=65)
			 {
				 adulto++;
			 }
			 else if(idade>65)
			 {
				 idoso++;
			 }
			 
			cont++;
			
		}	 
			System.out.println("Quantidade de pessoas menor de  18 = " + menorIdade); 
			System.out.println("Quantidade de pessoas de 18 ate 65 = " + adulto);
			System.out.println("Quantidade de pessoas Acima de 65 = " + idoso); 
			entrada.close();	
		
	}

}
