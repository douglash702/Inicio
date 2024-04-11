package fundamentos.operadores;

public class Ternararios {
public static void main(String[] args) {
	double media = 7.6;
	String resultaParcial = media>=5.0 ? "Em recuperação." : "Reprovado.";
	String resultadoFinal = media>= 7.0 ? "Aprovado." : resultaParcial;
	System.out.println("O aluno esta " + resultadoFinal);
	
	
	double nota = 7.3;
    boolean bomComportamento = true;
    boolean passouPorMedia = nota >= 5 ;
    boolean temDesconto = bomComportamento && passouPorMedia;
    String resultado = temDesconto ? "Sim." : "Não.";
    System.out.println("Tem desconto?  " + resultado);
		
		
	
	
	
	
}
	
	
	
}
