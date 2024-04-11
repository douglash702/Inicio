package fundamentos.operadores;

public class Unarios {
public static void main(String[] args) {
	int a = 1;
	int b = 2;
	
	
	//pos-fixada precedencia maior
	
	a++; //a = a + 1
	a--; // a = a - 1
	
//	pre-fixada precedencia menor na hora da comparação ele vai atrasar
	
	
	++b; // b = b + 1
	--b; // b = b - 1 
	
	 System.out.println(a);
	System.out.println(b);
	System.out.println("resposta");
	System.out.println(++a == b--); //precedencia
	System.out.println(a == b);
	System.out.println(a);
	System.out.println(b);
	
}
}
