package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe a media: ");
		double media = entrada.nextDouble();

		if (media <= 10 && media >= 7) {

			System.out.println("Aprovado!");
			System.out.println("Parabens!");
		}

		if (media < 7 && media >= 4.5) {
			// não usar ponto virgula em pontos de controles (tem uma excessão
			System.out.println("Recuperação");
			System.out.println("boa sorte e se esforçe mais ");

		}
		// se o bloco if ficar muito grande quebre em variaveis!!!!

		if (media < 4.5 && media >= 0) {
			System.out.println("Reprovado");
			System.out.println("Mais sorte no proximo ano");

		}
		entrada.close();

	}

}
