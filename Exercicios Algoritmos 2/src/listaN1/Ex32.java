package listaN1;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int A,B,C;
		int maior,menor,inter;
		
		
		System.out.println("Insira o valor do A: " );
		A = entrada.nextInt();
		System.out.println("Insira o valor do B: " );
		B = entrada.nextInt();
		System.out.println("Insira o valor do C: " );
		C = entrada.nextInt();
		
		if (A>B && B>C) { System.out.println("C = Menor, B = Inter, A = Maior. ");
		}if (B>A && A>C) { System.out.println("C = Menor, A = Inter, B  = Maior.");
		}if (C>A && A>B) { System.out.println("B = Menor, A = Inter, C = Maior. ");
		}if (A>C && C>B) { System.out.println(" B = Menor, C = Inter, A = Maior. ");
		}if (B>C && C>A) { System.out.println("A = Menor, C = Inter,  B = Maior. ");
		}if (C>B && B>A) { System.out.println(" A = Menor, B = Inter,  C = Maior. ");
		}
		
		
	}
		
	}


