package listaN1;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		
		int numero, centena, dezena, unidade;
		
		System.out.println("Informe um n�mero inteiro de 3 d�gitos: ");
		numero = entrada.nextInt();
		
		unidade = (numero % 10);
		dezena = ((numero % 100)/ 10);
		centena = ((numero %1000)/100);
		
		System.out.println("Centena: " + centena + "\nDezena: " + dezena + "\nUnidade: " + unidade);

		System.out.println("N�mero inverso: " +unidade+dezena+centena);
		
		entrada.close();
		
	}

}
