package listaN1;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double peso, altura,imc;
		
		System.out.println("informe o Peso: ");
		peso = entrada.nextDouble();
		System.out.println("Informe a altura:");
		altura = entrada.nextDouble();
		
		imc=peso /Math.pow(altura, 2);
		System.out.println("O valor do IMC é: " + imc);
		
		if(imc < 18.5) { System.out.println(" Pessoa abaixo do Peso. ");
		}
		else if(imc >= 18.5 && imc < 25) {System.out.println("Pessoa com peso normal");
		}
		else if(imc >= 25 && imc < 30) {System.out.println("Pessoa está acima do Peso");
		}
		else {System.out.println("Pessoa está obesa");
		}
		
		
		
	}

}
