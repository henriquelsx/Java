package listaN1;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		   int valor, horas,segundos, restoHoras,minutos,restoMinutos;
	        
	       System.out.println("Insira os segundos: ");
	        valor = entrada.nextInt();
	       
	        horas = valor / 3600;
	        restoHoras = valor % 3600;
	       
	        minutos = restoHoras / 60;
	        restoMinutos = restoHoras % 60;
	        segundos = restoMinutos;
	        
	        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
	        entrada.close();
	}

}
