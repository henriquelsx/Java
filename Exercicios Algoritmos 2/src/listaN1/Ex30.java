package listaN1;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String letra;
		
		
		System.out.println("Insira uma letra do alfabeto: ");
		letra = entrada.nextLine();
		
		if(letra.equalsIgnoreCase("a")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("e")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("i")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("o")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("u")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("y")) { System.out.println("Isso é uma vogal");
		} else if (letra.equalsIgnoreCase("w")) { System.out.println("Isso é uma vogal");
		} else {System.out.println("Isso é uma consoante");
		}
		
		
		entrada.close();
		

	}

}
