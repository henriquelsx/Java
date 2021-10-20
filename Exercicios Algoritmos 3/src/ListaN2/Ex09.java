package ListaN2;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
int c = 1 ;
System.out.println("\n ----------CRESCENTE------------");

while(c <= 299)
{
System.out.printf("\nContador = %d " , c);
	c++;
	
}
System.out.println("\n ----------DECRESCENTE------------");

while(c >= 0)
{
System.out.printf("\nContador = %d " , c);
	c=c-1;
}
	
			
		
		
		
		
		
		
		
		
		
entrada.close();		
	}

}
