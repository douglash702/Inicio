package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	    String valor = "";
	     
       while (!valor.equalsIgnoreCase("fim")) {
		System.out.println("Diga o que quiser: ");
		valor = entrada.nextLine();
	}

			
entrada.close();
			
			
		

	}

}
