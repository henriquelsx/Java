package listaN1;

import java.util.Scanner;

public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
	int codigo = 0;
	double precoDvd,precoFinal = 0;
	int categoria;
	
	System.out.println("Insira o valor do DVD:");
	precoDvd = entrada.nextDouble();
	System.out.println("Insira o dia da semana: \n (1) Domingo \n (2) Segunda - Feira \n (3) Ter�a - Feira \n (4) Quarta - Feira \n (5) Quinta - Feira \n (6) Sexta - Feira \n (7) S�bado");
	codigo=entrada.nextInt();
	System.out.println("O DVD � : \n (1) Lan�amento \n (2) N�o-Lan�amento");
	categoria = entrada.nextInt();
	
	
	
	switch (codigo){
	case 2,3,5 : 
		if( categoria == 1) { 
        precoFinal = (precoDvd*0.15)+precoDvd  - ((precoDvd*0.15 + precoDvd) * 0.4); 
        }
		
	precoFinal = precoDvd - (precoDvd * 0.4);
	System.out.println("Pre�o final pela loca��o do DVD : " + precoFinal);	
	break;
	case 4,6,7,1 :
		if (categoria == 1) { precoFinal = (precoDvd *0.15)+precoDvd; }
	System.out.println("Pre�o final pela loca��o do DVD : " + precoFinal);
		
		
		
	}	
		
		
		
		
		
		
		
entrada.close();
	}

}
