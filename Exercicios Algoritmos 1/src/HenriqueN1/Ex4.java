package HenriqueN1;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		
		Scanner entrada = new Scanner (System.in);
		
	double faturamento;
	int opcao;
	
	System.out.println("Entre com o faturamento mensal em reais da empresa: ");
	faturamento = entrada.nextDouble();
	
	System.out.println("Qual o tipo de Despesa gostaria de verificar? ");
	System.out.println("(1) Pagamento de funcionários ");
	System.out.println("(2) Estoque e mantimentos ");
	System.out.println("(3) Impostos ");
	System.out.println("(4) Valor após o pagamento de todas as Despesas ");
	opcao = entrada.nextInt();
	
	
	switch (opcao){
	case 1 :
	faturamento = faturamento * 0.32;	
		
	System.out.println("Gasto com o pagamento de funcionários: " +faturamento+ " R$.");	
	break;
	}
	switch (opcao){
	case 2 :
	faturamento = faturamento * 0.15;	
		
	System.out.println("Gasto com estoque e mantimentos: " +faturamento+ " R$.");	
	break;
	}	
	switch (opcao){
	case 3 :
	faturamento = faturamento * 0.23;	
		
	System.out.println("Gasto com estoque e mantimentos: " +faturamento+ " R$.");	
	break;
	}	
	switch (opcao){
	case 4 :
	faturamento = 	faturamento - (faturamento * 0.92);	
		
	System.out.println("Após o pagamento de todas as despesas sobrará: " +faturamento+ " R$.");	
	break;
	}	
	
	
	
	
	
	
	
	
		
		
	entrada.close();	
	}

}
