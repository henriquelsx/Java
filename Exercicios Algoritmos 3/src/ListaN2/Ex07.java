package ListaN2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner entrada = new Scanner (System.in)	;
		
int g = 0,v = 0,o = 0,c=0;
String time = " ";



do{
	c++;
	System.out.println("Pra qual time você torce? \n G = Goiás \n V = Vila Nova \n O = Outros");
	time = entrada.nextLine();
	
 if (time.equalsIgnoreCase("G")) {
	 g=g+1;
}if (time.equalsIgnoreCase("V")) {
     v=v+1;
}if (time.equalsIgnoreCase("O")) {
     o=o+1;
}
}while(!time.equalsIgnoreCase("F"));

System.out.println(" --------------RESULTADOS------------");
System.out.println(" Torcedores do Goiás : " + g);
System.out.println(" Torcedores do Vila : "+ v);
System.out.println(" Torcedores de outros times : "+ o);
System.out.println("Total de respostas: "+c);
		
		
		
entrada.close();		
	}

}
