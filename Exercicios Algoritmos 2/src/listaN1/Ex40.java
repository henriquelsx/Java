package listaN1;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada = new Scanner(System.in);

int idade;

System.out.println("Insira a idade do usu�rio: ");
idade = entrada.nextInt();

if(idade < 16) {System.out.println("N�o-Eleitor: Abaixo de 16 anos.");
}if(idade < 65 && 18 <= idade) {System.out.println("Eleitor obrigat�rio. Entre 18 e 65 anos. ");
}if(idade >= 16 && idade<18) {System.out.println("Eleitor Facultativo: entre 16 e 18 anos. ");
}if(idade >65) {System.out.println("Eleitor Facultativo: Maior de 65 anos. ");
}
		
		
		
		
		
	entrada.close();	
	}

}
