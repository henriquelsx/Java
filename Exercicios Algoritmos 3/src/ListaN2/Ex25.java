package ListaN2;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitura = new Scanner (System.in);
		
		int n,c;
		
		
		System.out.println("Digite um número para a Tabuada: ");
		n = leitura.nextInt();
		while(n>10||n<1) {
			System.out.println("Insira um Valor entre 1 e 10");
			n=leitura.nextInt();
		}
		for (c=1; c<=10; c++)
		{
		System.out.println(n + " X " + c + " = " + n*c);
		}
		
		
	leitura.close();
	}

}
