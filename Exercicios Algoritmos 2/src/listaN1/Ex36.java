package listaN1;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner(System.in);
	double compra, valor;
	
	System.out.println("Insira o valor da Compra: ");
	compra = entrada.nextDouble();
	
if(compra < 10) { valor = (compra * 0.7) + compra;
System.out.println("O valor da venda do produto será de: "+valor);
}
if(10 <= compra && compra<30) { valor = (compra * 0.5) + compra;
System.out.println("O valor da venda do produto será de: "+valor);
}
if(30 <= compra && compra < 50) { valor = (compra * 0.4) + compra;
System.out.println("O valor da venda do produto será de: "+valor);
}
if(compra >=50) { valor = (compra * 0.3) + compra;
System.out.println("O valor da venda do produto será de: "+valor);
}



entrada.close();	
	}

}
