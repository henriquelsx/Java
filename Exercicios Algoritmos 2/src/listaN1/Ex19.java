package listaN1;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		float tempogasto, velmedia;
		int autonomia = 12;
		float distancia;
		float litrosUsados;
		
		System.out.println("Insira o tempo gasto na viagem em horas: ");
		tempogasto = entrada.nextFloat();
		
		System.out.println("Velocidade m�dia durante a viagem: ");
		velmedia = entrada.nextFloat();
		
		distancia = (tempogasto)*velmedia;
		litrosUsados = distancia/12;
		
		System.out.println("Em uma viagem de " +tempogasto+ " horas, percorrendo a " +velmedia+ " km/h. \nVoc� percorrer� uma distancia de " +distancia+ " e gastar� " +litrosUsados+ " litros de combust�vel." );
		
		
		entrada.close();

	}

}
