package ListaN2;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


			Scanner entrada = new Scanner(System.in);

			int num, c, soma = 0, N;

			System.out.println("Informe um n�mero: ");
			N = entrada.nextInt();
			while (N <= 1) {
				System.out.println("Informe um n�mer acima de 1: ");
				N = entrada.nextInt();
			}

			for (num = 2; num <= N; num++) {
				soma = 0;
				for (c = 1; c <= num / 2; c++) {
					if (num % c == 0) {
						soma += c;
					}
					
				}

				if (num == soma) {
					System.out.println(num + " � PERFEITO!");
				} 
				
			}

			entrada.close();
		}	

}
