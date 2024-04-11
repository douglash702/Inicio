package controle;

import javax.swing.JOptionPane;

public class IfElse {
public static void main(String[] args) {
	
	
	//string
	String valor = JOptionPane.showInputDialog("Informe o numero: ");
	
	
	//transformou uma String em um inteiro
	int numero = Integer.parseInt(valor);
	
	if(numero %2 == 0)  
		{System.out.println("Numero par!!");
		}	

 else {
		System.out.println("Numero impar");
 }
	
 }
}
