package fundamentos.operadores;

public class Relacionais {
	public static void main(String[] args) {
		
	int a = 97;
	int b = 'a';
	System.out.println(a == b); //igual
	System.out.println(3 >= 3); //maior igual
	System.out.println(30 <= 6); //menor igual
	System.out.println(3 < 7); //menor
	System.out.println(3 > 4); // maior
	System.out.println(30 != 7); //diferente
	double nota = 7.3;
    boolean bomComportamento = true;
    boolean passouPorMedia = nota >= 5 ;
    boolean temDesconto = bomComportamento && passouPorMedia;
    
    System.out.println("Tem desconto? " + temDesconto);
		
		
		
	}

}
