
package inicio;

import java.util.Scanner;

public class DesafioConversão { public static void main(String[] args) {
   
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Digite seu primeiro salário: ");
            double salario1 = scanner.nextDouble();

            System.out.println("Digite seu segundo salário: ");
            double salario2 = scanner.nextDouble();

            System.out.println("Digite seu terceiro salário: ");
            double salario3 = scanner.nextDouble();

            double soma = salario1 + salario2 + salario3;
            double media = soma / 3;

            System.out.printf("A soma dos salários é %.2f%n", soma);
            System.out.printf("A média dos salários é %.2f%n", media);
        } catch (Exception e) {
            System.out.println("Erro: Insira um valor numérico válido.");
        } finally {
            scanner.close();
        }
    }
}


