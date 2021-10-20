package ListaN2;

import java.util.Arrays;
import java.util.Random;

public class Ex46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int vetor [] = new int [300];
int par []	= new int [0];
int impar []	= new int [0];
		Random random = new Random();		
		
	for (int i = 0 ; i < vetor.length; i++) {
		vetor[i] = random.nextInt(300);	
	
	if(vetor[i] %2 == 0) {
		par [i] = vetor [i];
	}else {
		impar [i] = vetor [i];
	}
	
		
	
	}
	System.out.println(Arrays.toString(vetor));
	System.out.println(Arrays.toString(par));
	System.out.println(Arrays.toString(impar));
	}
	


}
