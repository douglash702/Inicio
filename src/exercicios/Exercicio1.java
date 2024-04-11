package exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
	System.out.println("Digite a tempratura em farehtins: ");
    double temperatura = entrada.nextDouble(); 
    double conversao = (temperatura - 32) / 1.8;
    System.out.println("Valor em celsius é: " + conversao);
 
    
    
    entrada.close();






}
}
