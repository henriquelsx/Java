package listaN1;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		int dia,mes,ano;
		
		System.out.println("Insira o dia: ");
		dia = entrada.nextInt();
		System.out.println("Insira o mês: ");
		mes = entrada.nextInt();
		System.out.println("Insira o ano: ");
		ano = entrada.nextInt();
		
		
		if(dia > 31) { System.out.println(" Dia não existe! ");
		}
		switch (mes){
		case 1 :
		System.out.println(dia + " de janeiro de " +ano);	
		break;
		case 2 :
			System.out.println(dia + " de fevereiro de " +ano);	
			break;
		case 3 :
			System.out.println(dia + " de março de " +ano);	
			break;
		case 4 :
			System.out.println(dia + " de abril de " +ano);	
			break;
		case 5 :
			System.out.println(dia + " de maio de " +ano);	
			break;
		case 6 :
			System.out.println(dia + " de junho de " +ano);	
			break;
		case 7 :
			System.out.println(dia + " de julho de " +ano);	
			break;
		case 8 :
			System.out.println(dia + " de agosto de " +ano);	
			break;
		case 9 :
			System.out.println(dia + " de setembro de " +ano);	
			break;
		case 10 :
			System.out.println(dia + " de outubro de " +ano);	
			break;
		case 11 :
			System.out.println(dia + " de novembro de " +ano);	
			break;
		case 12 :
			System.out.println(dia + " de dezembro de " +ano);	
			break;
		default:	
			System.out.println("Mês não existe");
		}
		
		
	entrada.close();	
	}

}
