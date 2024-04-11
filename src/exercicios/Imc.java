package exercicios;

import java.io.InputStream;
import java.util.Scanner;

public class Imc { public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite seu peso:");
	double peso  = entrada.nextDouble();
	System.out.println("Digite sua altura:");
	double altura = entrada.nextDouble();
	double resultado = peso / (altura*altura);
   System.out.println("seu IMC é: " + resultado);	
	
	entrada.close();
}


}


