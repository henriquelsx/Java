package listaN1;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double lcd;	
		double led;
		double plasma;
		double salario = 1045*2;
		double comissao;
		
		System.out.println("Quantas TV's LCD foram vendidas? ");
		lcd = entrada.nextDouble();
		
		System.out.println("Quantas TV's LED foram vendidas? ");
		led = entrada.nextDouble();
		
		System.out.println("Quantas TV's de PLASMA foram vendidas? ");
		plasma = entrada.nextDouble();
		
		comissao = (lcd*50)+(led*60)+(plasma*75)+salario;
		
		System.out.println("Seu sálario + comissão esse mês é de " + comissao + " R$");
	
		entrada.close();
	}

}
