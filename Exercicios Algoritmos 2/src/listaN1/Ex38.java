package listaN1;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		double precoFinal, precoInicial;
		int opc;
		
		System.out.println("Informe o valor de F�brica do Ve�culo: ");
		precoInicial = entrada.nextDouble();
		
		precoFinal = precoInicial;
		
		System.out.println("Deseja adicionar ar-condicionado ao carro? (0- N�o; 1- Sim): ");
		opc = entrada.nextInt();
		
		if (opc == 1)
		{
			precoFinal = precoFinal + 1750;
		}
		
		System.out.println("Deseja adicionar pintura ment�lica ao carro? (0- N�o; 1- Sim): ");
		opc = entrada.nextInt();
		
		if (opc == 1)
		{
			precoFinal = precoFinal + 800;
		}
		
		System.out.println("Deseja adicionar vidro el�trico ao carro? (0- N�o; 1- Sim): ");
		opc = entrada.nextInt();
		
		if (opc == 1)
		{
			precoFinal = precoFinal + 1200;
		}
		
		System.out.println("Deseja adicionar dire��o hidr�ulica ao carro? (0- N�o; 1- Sim): ");
		opc = entrada.nextInt();
		
		if (opc == 1)
		{
			precoFinal = precoFinal + 2000;
		}
		
		System.out.println("O valor final do carro �: R$"+ precoFinal);
		
		entrada.close();

	}

}
		
		
		
		
		
		
	


