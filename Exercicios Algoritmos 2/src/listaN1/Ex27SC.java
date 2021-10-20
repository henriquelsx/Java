package listaN1;

import java.util.Scanner;

public class Ex27SC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Scanner entrada = new Scanner (System.in);
		
		int opcao;
		float A,B;
		float soma,multiplica,divisao,subtracao;
		
		System.out.println("Insira o primeiro número: ");
		A = entrada.nextFloat();
		System.out.println("Insira o segundo número: ");
		B = entrada.nextFloat();
		System.out.println("Escolha a operação a ser calculada: \nSoma: (1) \nSubtração: (2) \nMultiplicação: (3) \nDivisão: (4)");
		opcao = entrada.nextInt();
		
		soma = A+B;
		subtracao = A-B;
		multiplica = A*B;
		divisao = A/B;
		
		switch (opcao){
		case 1 :
		System.out.println("A soma é: " +soma);	
		break;
		case 2 :
			System.out.println("A subtração é: " +subtracao);	
			break;
		case 3 :
			System.out.println("A multiplicação é: " +multiplica);
			break;
		case 4 :
			System.out.println("A divisao é: " +divisao);
			break;
		default:	
			System.out.println("Operação inválida");}
		
		
		
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
