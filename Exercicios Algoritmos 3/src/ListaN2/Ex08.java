package ListaN2;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in);	
		
		int inicio = 0, fim = 0, divisor, calculo=inicio;
		
	    System.out.println("Entre com o valor do dividor: " );
	    divisor = entrada.nextInt();
	    System.out.println("Inicio do Intervalo: "); 
	    calculo = entrada.nextInt();
	    System.out.println("Fim do Intervalo: ");
	    fim = entrada.nextInt();
	    System.out.println("Numero divisivel por "+divisor+" no intervalo de "+inicio+" a "+fim+":");   
		
	    while (calculo <= fim)

{
	    	if (calculo % divisor == 0)

    {
        System.out.print(calculo+" ");
    }
    calculo++;
}			
		entrada.close();
	}

}
