package exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a base do triangulo: ");
		double base = entrada.nextDouble();
		System.out.println("Digite a altura do triangulo: ");
		double altura = entrada.nextDouble();
		double resultado = (base*altura) /2 ;
		System.out.println("A area do triangulo é: " + resultado );
		
		entrada.close();
		
	}

}
