package inicio;

import java.awt.SystemColor;
import java.util.Scanner;

public class Console { public static void main(String[] args) {
	System.out.print("Bom "); 
	System.out.print("dia !!! \n");
	System.out.println("Boa");
	System.out.println("tarde !!!");
	System.out.printf("Megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6 );
    System.out.printf("premio: R$ %.1f\n", 1258.435);
    System.out.printf("nome: %s%n", "Douglas");
	 
    Scanner Entrada = new Scanner(System.in);
	System.out.println("digite seu nome: ");
	String nome = Entrada.nextLine();
	System.out.println("digite seu sobrenome: ");
	String Sobrenome = Entrada.nextLine();
	System.out.println("digite sua idade: ");
	int Idade = Entrada.nextInt();
	System.out.println("Nome: " + nome + " " + Sobrenome + "\nIdade: " + Idade);
	Entrada.close();
	
}


}
