package CursoEmJava;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		System.out.println("2" == "2");
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); //equals compara os conteudos
		
		
		Scanner scanner = new Scanner(System.in);
		
		String s2 = scanner.next(); // o next tirar os espaços em branco o nextline não tirar
		System.out.println("2" == s2.trim()); // trim tira os espacos em branco
		System.out.println("2".equals(s2));	
			
		
		
		//quando for comprar string tomar cuidado para comparar com = mas sim com equals
		
		scanner.close();
		
		
		
		
		
	}

}
