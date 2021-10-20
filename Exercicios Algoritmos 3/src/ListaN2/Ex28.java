package ListaN2;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
double pesoBoi, maisGordo = 0, maisMagro = 0;

		
		
		for (int c=1;c==5;c++)	{ 
		System.out.println("Insira o peso do boi " +c);	
			pesoBoi = entrada.nextDouble();
			if (pesoBoi>maisGordo) {
				maisGordo = pesoBoi;	
		}if (pesoBoi<maisMagro) {
			maisMagro=pesoBoi;
		}
		
			
		}
		
		System.out.println(maisGordo);
		System.out.println(maisMagro);
		
		
		
		
	}

}
