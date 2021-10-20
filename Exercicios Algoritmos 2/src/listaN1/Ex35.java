package listaN1;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int opc;
		
		System.out.println("Escolha uma opção :");
		System.out.println("1: Pizza");
		System.out.println("2: Picanha");
		System.out.println("3: Peixe");
		opc = entrada.nextInt();
		
		
		
		
		if (opc == 1) {
		System.out.println(" Opção (1) (Pizza), pedido realizado com sucesso!" );
		} 
		
		if (opc == 2) {
		 System.out.println(" Opção (2) (Picanha), pedido realizado com sucesso!" );
		}
		
		if (opc == 3) {	
		 System.out.println(" Opção (3) (Peixe), pedido realizado com sucesso!" );
		}
		
		
	}
	

}
