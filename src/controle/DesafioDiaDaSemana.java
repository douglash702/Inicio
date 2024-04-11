package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String diaSemana = entrada.nextLine().toLowerCase();
		int numeroSequencia = -1;

		if (diaSemana.equals("domingo") || diaSemana.equals("domingo")) {
			numeroSequencia = 1;
		}

		else if (diaSemana.equals("segunda-feira") || diaSemana.equals("segunda")) {
			numeroSequencia = 2;
		} else if (diaSemana.equals("terça-feira") || diaSemana.equals("terça")) {
			numeroSequencia = 3;
		} else if (diaSemana.equals("quarta-feira") || diaSemana.equals("quarta")) {
			numeroSequencia = 4;
		} else if (diaSemana.equals("quinta-feira") || diaSemana.equals("quinta")) {
			numeroSequencia = 5;
		} else if (diaSemana.equals("sexta-feira") || diaSemana.equals("sexta")) {
			numeroSequencia = 6;
		} else if (diaSemana.equals("sabado") || diaSemana.equals("sabado")) {
			numeroSequencia = 7;
		} else {
                    System.out.println("Dia invalido");
			
		}
	
		
		if (numeroSequencia != -1)
			;
		{

			System.out.println("O numero da sequencia para " + diaSemana + " é " + numeroSequencia); 
		} 
	            
		
	        entrada.close();
	    }
	}
