package fundamentos.operadores;

public class Atribuicao {
 public static void main(String[] args) {
	
	 int a = 3;
	 int b = a;
	 int c = a + b;
	 
	  c +=b;  //c= c + b;
	  c-=a;  // c = c - a;  
	  c *=b; // c = c * b;
	  c/=a; //  c = c/b;
	  c %=2; // c = c %2; resultado 0 ou 1 ou vai ser um numero par ou impar 
	 System.out.println(c);
	 c++; // c = c + 1 valor unario
}
	
	
}
