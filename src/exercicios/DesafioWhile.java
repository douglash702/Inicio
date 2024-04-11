package exercicios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Para sair digite -1");
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {

			System.out.println("Informe a nota: ");
			nota = entrada.nextDouble();
			if (nota <= 10 && nota >= 0) {

				total += nota;
				quantidadeDeNotas++;

			} else {
				System.out.println("Nota invalida");
			}
		}
//calcular media s
		double media = total / quantidadeDeNotas;
		System.out.println("media = " + media);

		entrada.close();
	}

}
