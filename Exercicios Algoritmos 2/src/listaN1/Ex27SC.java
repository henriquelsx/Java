package listaN1;

import java.util.Scanner;

public class Ex27SC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner entrada = new Scanner (System.in);
		
		int opcao;
		float A,B;
		float soma,multiplica,divisao,subtracao;
		
		System.out.println("Insira o primeiro n�mero: ");
		A = entrada.nextFloat();
		System.out.println("Insira o segundo n�mero: ");
		B = entrada.nextFloat();
		System.out.println("Escolha a opera��o a ser calculada: \nSoma: (1) \nSubtra��o: (2) \nMultiplica��o: (3) \nDivis�o: (4)");
		opcao = entrada.nextInt();
		
		soma = A+B;
		subtracao = A-B;
		multiplica = A*B;
		divisao = A/B;
		
		switch (opcao){
		case 1 :
		System.out.println("A soma �: " +soma);	
		break;
		case 2 :
			System.out.println("A subtra��o �: " +subtracao);	
			break;
		case 3 :
			System.out.println("A multiplica��o �: " +multiplica);
			break;
		case 4 :
			System.out.println("A divisao �: " +divisao);
			break;
		default:	
			System.out.println("Opera��o inv�lida");}
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
