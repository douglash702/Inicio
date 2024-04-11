package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		 
		System.out.println(condicao1 && !condicao2); //and
		System.out.println(condicao1 || condicao2); // or
		System.out.println(condicao1 ^ condicao2); // xor
		System.out.println(!!condicao1); // not
		System.out.println(!condicao2); // not
		
		// tabela verdade
	    System.out.println("tabela verdade");
		System.out.println(true && true); //and
		System.out.println(true && false); //and
		System.out.println(false && true); //and
		System.out.println(false && false); //and
		
		// tabela ou 
		System.out.println("tabela ou");
		System.out.println(true || false); //or
		System.out.println(false || true); //or
		System.out.println(true || true); //or
		System.out.println(false || false); //or
		 
		// tabela do ou exclusivo
		System.out.println("tabela ou exclusivo"); //xor
		System.out.println(true  ^ false); //xor
		System.out.println(true ^ true); //xor
		System.out.println(false ^ false); //xor
		System.out.println(false ^ true); //xor
		
	// tabela do não	
		
		System.out.println("tabela do não"); //not
		System.out.println(!true); //not
		System.out.println(!false); //not
		System.out.println(!!true); //not
		System.out.println(!!false); //not
		
		
		
	}
	
	


}
