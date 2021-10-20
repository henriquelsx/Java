package ListaN2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);
 
int n,cont=1;
double num = 0 ,media, numMedia = 0;

System.out.println("Insira um número: ");		
n=entrada.nextInt();		
		
while(num > 0) {
System.out.println("Insira um número: ");
num =entrada.nextDouble();
numMedia= numMedia+num;
cont=cont+1;	
}		

media = (n + numMedia) / cont;
System.out.println("Média dos números: " +media);		
entrada.close();		
	}

}
