package fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class Aritimeticos {
	
	 public static void main(String[] args) {
	     double valor1;
	     double valor2;
	     String b;
	     boolean continuar;
	do {
	        Scanner Entrada = new Scanner (System.in);
	        System.out.println("Digite um numero:  ");
	        valor1 = Entrada.nextDouble();
	        System.out.println("Digite a operação (+, -, *, /)");
	        b = Entrada.next();
	        System.out.println("Digite o segundo numero: ");
	        valor2 = Entrada.nextDouble();
	        System.out.println("Resultado: " + realizarCalculo(valor1, valor2, b));
	        continuar = verificarNovaOperacao();
	}while (continuar);

	 


	}
	    // METODO PARA CONTINUAR O PROGAMA
	    public static Boolean verificarNovaOperacao() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Deseja realizar uma nova operação? (S ou N): ");
	        return sc.nextLine().toUpperCase(Locale.ROOT).equals("S");
	        
	        
	    }
	 
	    
	    //METODO PARA REALIZAR O CALCULO
	  
	    public static Double realizarCalculo (Double valor1, Double valor2, String b) { 
	        Double    respostaCalculo = 0.0;
	    switch (b){
	        
	        case  "+" -> respostaCalculo = valor1 + valor2;
	        case  "-" -> respostaCalculo = valor1 - valor2;
	        case  "/" -> respostaCalculo = valor1 / valor2;
	        case  "*" -> respostaCalculo = valor1 * valor2;
	        default -> System.out.println("Operação e invalida");
	        
	        
	        
	        
	        
	    }
	            
	    return respostaCalculo;
	        
	    }
	}



