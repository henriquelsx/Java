package ListaN2;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner entrada = new Scanner (System.in);		
		
	int num = 1,qtdNum = 0,somaNum = 0,maior,menor,somaPar = 0,qtdPar,numPar=0, qtdImpar;
	double media,mediaPar;
	
	do{
		System.out.println("Insira um Valor: ");	
		num = entrada.nextInt();
		
		qtdNum++;
		somaNum = somaNum +num;
		
		if ((num % 2) == 0) { 
			  numPar = num;
			   somaPar += numPar; 
			  
			 }
			 

	}
	
	while (num!=0) ;
	
	
		mediaPar = somaPar/qtdNum;
		media = somaNum/qtdNum;
		System.out.println("-------------RESULTADOS-------------");
		System.out.println("Numeros digitados : " +qtdNum);
		System.out.println("Média dos números digitados: " +media);
		System.out.println("Soma dos números digitados: " +somaNum);
		System.out.println("Média dos números pares "+ mediaPar);
		
		
		
		
		
		
		
		
		
		
		
		
		entrada.close();
	}

}
