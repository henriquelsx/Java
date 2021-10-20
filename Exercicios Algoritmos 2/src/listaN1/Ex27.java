package listaN1;

import java.util.Scanner;

public class Ex27 {

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
		
		
		if(opcao == 1) {System.out.println("O resultado da Soma é: " + soma);
		} else if(opcao==2) {System.out.println("O resultado da Subtração é: " + subtracao);
		}else if(opcao==3) {System.out.println("O resultado da Multiplicação é: " + multiplica);
		}else if(opcao==4 && B > 0) {System.out.println("O resultado da Divisão é: " + divisao);
		}
		
		
		entrada.close();	
}

}
