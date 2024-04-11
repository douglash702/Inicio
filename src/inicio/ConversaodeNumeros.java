package inicio;

//import java.nio.file.spi.FileSystemProvider;

public class ConversaodeNumeros {
	public static void main(String[] args) {
		double b = 1.12345678888; // implicita
		System.out.println(b);
		float a = (float) 1.12345678888; // explicita (cast)
		System.out.println(a);
		int c = 130;
		byte d = (byte) c; // explicita (cast)
		System.out.println(d);
//byte d =c; não vai da certo pq o valor
		// tipo int e maior que o byte
//java não analisa valor mas sim tipos
		double e = 1.999999;
		int f = (int) e; // explicita
		System.out.println(f);
	}

}
