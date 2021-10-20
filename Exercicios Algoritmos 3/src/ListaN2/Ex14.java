package ListaN2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner (System.in);

int idade, media = 0, contador = 0,maior = 0,menor = 0;



do {
	System.out.println("Informe a idade do usuário: ");
	idade = entrada.nextInt();
	contador++;
	media+= idade;
	  if ( contador == 1) {
	        menor = idade;
	        maior = idade;
	    } else if (idade < menor && idade != 0) {
	        menor = idade;
	    } else if (idade > maior) {
	        maior = idade;
	    }
}
while(idade != 0);	
		System.out.println("------ RESULTADOS ------");
		System.out.println("Total de usuários: " + contador);
		System.out.println("Média de idade: " + (media / contador));
		System.out.println("Maior idade : " + maior);
		System.out.println("Menor idade : " + menor);
	}

}
