package ListaN2;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int numero, fat = 1;
        int cont = 1;

        do{
            System.out.println("Digite um nº");
            numero = entrada.nextInt();
            
            for(int i = 1;i <= numero; i++){
                fat = fat * i;
            }
            
            System.out.println("!" + numero + " = " + fat);
            cont++;
            
       }while(cont < 2);
    }
		                                    

}
