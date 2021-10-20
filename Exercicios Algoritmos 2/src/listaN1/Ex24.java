package listaN1;

import javax.swing.JOptionPane;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String valor = JOptionPane.showInputDialog("Informe o número");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) { 
			System.out.println("Número par!");
		
		} else { System.out.println("Número ímpar!");}
		
	}

}
