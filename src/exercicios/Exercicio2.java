package exercicios;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Digite um valor para ser elevado ao quadrado: ");
		double a = entrada.nextDouble();
		double resultado = Math.pow(a, 2);
		System.out.println("O valor quadrado é: " + resultado);
		System.out.println("Digite um valor para ser elevado ao cubo: ");
		double b = entrada.nextDouble();
		double resultado2 = Math.pow(b, 3);
		System.out.println("O valor cubico é: " + resultado2);
	
	}

}
