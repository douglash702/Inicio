package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		int nota = 0;
		System.out.println("Digite a nota de 1 a 10: ");
		nota = entrada.nextInt();

		switch (nota) {
		case 10:
		case 9:
			conceito = "A";
			break;

		case 8:
		case 7:
			conceito = "B";
			break;

		case 6:
		case 5:
			conceito = "C";
			break;
		case 4:
			conceito = "D";
			break;
//			posso fazer assim
		case 3: {
			conceito = "E";
			break;}
		//posso fazer assim
		case 2: case 1:
			conceito = "F";
			break;
		default:
			System.out.println("Nota invalida");

		}
		System.out.println("o conceito é " + conceito);
		System.out.println("Fim!!");
		entrada.close();
	}
}
