package inicio;

public class Tiposting {
	public static void main(String[] args) {
		System.out.println("Ola Mundo".charAt(2));
 //o valor da string e imutavel
 String s = "Boa Tarde";
 s = s.toUpperCase();
 System.out.println(s.concat("!!!"));
 System.out.println(s + "!!!");
 System.out.println(s.startsWith("Boa"));
 System.out.println(s.toLowerCase().startsWith("Boa"));
 System.out.println(s.toUpperCase().endsWith("Tarde"));
 System.out.println(s.equalsIgnoreCase("boa tarde"));
	var nome = "Pedro";
	var sobrenome = "Santos";
	var idade = 33;
	var salario = 12345.987;
	System.out.println("nome: " + nome + "\nsobrenome: " + sobrenome + "\nidade: " 
	+ idade + "\nsalario: " + salario + "\n\n");
	System.out.println( );
	System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f \n",
			nome, sobrenome, idade, salario);
	// %d valores inteiros, %s letras  %f tipo um doubles
	//colocando dentro de uma variavel
	String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f \n",
			nome, sobrenome, idade, salario); 
	System.out.println(frase);
	
	}

}
