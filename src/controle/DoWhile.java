package controle;

import java.util.Scanner;

public class DoWhile {
public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);

String valor = "por favor";


	do {
		System.out.println("Voce precisa falar as palavras magicas: ");
		System.out.print("Quer sair? ");
		valor = entrada.nextLine();
		
	} while(!valor.equalsIgnoreCase("por favor"));
	
	
	System.out.println("Obrigado");
	entrada.close();
	
	
}
}
