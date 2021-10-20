package ListaN2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int divisor, inicio, fim, num;
		String texto = "";
		
		System.out.println("Informe o divisor: ");
		divisor = entrada.nextInt();
		
		System.out.println("Informe o inicio do intervalo: ");
		inicio = entrada.nextInt();
		
		System.out.println("Informe o fim do intervalo: ");
		fim = entrada.nextInt();
		
		System.out.println("Números divisíveis por " + divisor + " no intervalo "
				+ inicio + " até " + fim + " são: ");
		
		
		if(inicio <= fim) 
		{
			num = inicio;
			while(num <= fim)
			{
				if(num % divisor == 0){
					texto += num + ", ";
				}
				num++;
			}
		}
		else{
			num = inicio;
			while(num >= fim)
			{
				if(num % divisor == 0){
					texto += num + ", ";
				}
				num--;
			}
		}
		
		System.out.println(texto.substring(0, texto.length()-2) + ".");

	}

}
