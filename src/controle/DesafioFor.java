package controle;

public class DesafioFor {
	public static void main(String[] args) {
		/*
		 * String valor = "#"; for (int i = 1; i <= 5; i++) { valor += "#";
		 * System.out.println(valor); //versão desafio //não pode usar valor numerico
		 * para controlar o laço!
		 * 
		 * }
		 */
         //usou o equal para comparar string ! = diferente, v += = atribuição contatenativa
		for (String v = "#"; !v.equals("######"); v += "#") {

			System.out.println(v);

		}

		{

		}

	}
}
