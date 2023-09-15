
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha após a entrada de inteiros
        System.out.println("Escolha uma das operações: +, -, *, /");
        String operador = sc.nextLine();
        int resultado = 0;

        switch (operador) {
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
                    System.out.println("Divisão por zero não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida!");
                break;
        }

        System.out.println("Resultado: " + resultado);
        sc.close();
    }
}
