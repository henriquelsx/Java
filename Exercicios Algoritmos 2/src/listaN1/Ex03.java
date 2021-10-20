package listaN1;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		
		String nomeMarido, nomeEsposa, sobrenomeMarido, sobrenomeEsposa;
        int anoCasamento, anoAtual = 2021, anoCasados;
		
        System.out.println("Informe o nome do marido: ");
		nomeMarido = entrada.nextLine();
		
		System.out.println("Informe o sobrenome do marido: ");
		sobrenomeMarido = entrada.nextLine();
		
		System.out.println("Informe o nome da esposa: ");
		nomeEsposa = entrada.nextLine();
		
		System.out.println("Informe o sobrenome da esposa: ");
		sobrenomeEsposa = entrada.nextLine();
		
		System.out.println("Informe o ano de casamento: ");
		anoCasamento = entrada.nextInt();
		
		anoCasados = anoAtual - anoCasamento;
		
		System.out.println(nomeMarido + " " + sobrenomeMarido + " é casado com " + nomeEsposa + " " + sobrenomeEsposa + " há " + anoCasados + " anos." );
		
		entrada.close();
		
		
		
		
		
		
		
		

	}

}
