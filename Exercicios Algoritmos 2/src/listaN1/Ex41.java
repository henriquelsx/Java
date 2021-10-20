package listaN1;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);

double calculo = 0;
int perfil, residencia, comercial, industrial;
double m;


System.out.println("Qual o seu perfil consumidor ? \n(1) Residencial \n(2) Comercial \n(3) Industrial");
	perfil = entrada.nextInt();
System.out.println("Insira o m³ gasto: ");
	m = entrada.nextDouble();

	switch (perfil){
	case 1 :
	calculo = 5 + 0.05 * m;
	System.out.println("Sua conta de água será no valor de: " +calculo+ " R$.");
	break;
	
	case 2 :
	if (m < 80) {
	calculo = 500; System.out.println("Sua conta de água será no valor de: " +calculo+ " R$.");
	} if (m > 80) {
		calculo = 500+(m-80)*0.25; System.out.println("Sua conta de água será no valor de: " +calculo + " R$.");
	}break;
	
	case 3 :
		if (m < 100) {
		calculo = 800; System.out.println("Sua conta de água será no valor de: " +calculo+ " R$.");
		} if (m > 100) {
			calculo = 800+(m-100)*0.04; System.out.println("Sua conta de água será no valor de: " +calculo+ " R$.");
		}break;
	
	
	
	}	
		
entrada.close();		
	}

}
