package CursoEmJava;

import java.util.Scanner;

public class DesafioInicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um número: ");
        double num1 = scanner.nextDouble();
        System.out.println("Informe um número: ");
        double num2 = scanner.nextDouble();
        System.out.println("Informe a operação (+, -, *, /, %): ");
        String op = scanner.next();

        // Lógica do cálculo
        double resultado = 0;

        switch (op) {
            case "+":
                resultado = num1 + num2;
                break;
            case "-":
                resultado = num1 - num2;
                break;
            case "*":
                resultado = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: Divisão por zero!");
                    return; // Termina o programa se houver uma tentativa de divisão por zero
                }
                break;
            case "%":
                resultado = num1 % num2;
                break;
            default:
                System.out.println("Operação inválida!");
                return; // Termina o programa se uma operação inválida for especificada
        }

        System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

        scanner.close();
    }
}

	
	
	

