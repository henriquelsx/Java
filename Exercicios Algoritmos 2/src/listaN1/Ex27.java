package listaN1;

import java.util.Scanner;

public class Ex27 {

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
		
		
		if(opcao == 1) {System.out.println("O resultado da Soma �: " + soma);
		} else if(opcao==2) {System.out.println("O resultado da Subtra��o �: " + subtracao);
		}else if(opcao==3) {System.out.println("O resultado da Multiplica��o �: " + multiplica);
		}else if(opcao==4 && B > 0) {System.out.println("O resultado da Divis�o �: " + divisao);
		}
		
		
		entrada.close();	
}

}
