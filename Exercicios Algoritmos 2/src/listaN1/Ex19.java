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
		
		System.out.println("Velocidade média durante a viagem: ");
		velmedia = entrada.nextFloat();
		
		distancia = (tempogasto)*velmedia;
		litrosUsados = distancia/12;
		
		System.out.println("Em uma viagem de " +tempogasto+ " horas, percorrendo a " +velmedia+ " km/h. \nVocê percorrerá uma distancia de " +distancia+ " e gastará " +litrosUsados+ " litros de combustível." );
		
		
		entrada.close();

	}

}
