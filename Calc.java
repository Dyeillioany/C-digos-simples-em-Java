import java.util.Scanner;
import java.lang.Math;
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String escolha;
        while (true) {
            System.out.println("Digite a operação que deseja realizar: "+
                    "A = Adição; " +
                    "B = Subtração;" +
                    "C = Multiplicação" +
                    "D = X elevado a Y;" +
                    "E = Função Seno;" +
                    "F = Função Cosseno;" +
                    "G = Função Tangente;");
            System.out.println("Para encerrar o processo, digite X");


            escolha = sc.next().toUpperCase();

            if (escolha.equals("X")) {
                break;
            }

            if (escolha.equals("A")) {
                System.out.println("Escolha o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println("Escolha o segundo número: ");
                int num2 = sc.nextInt();
                int resultado = adicionar(num1, num2);
                System.out.println("O resultado é " + resultado);
            } else {
                System.out.println("Operação inválida!");
            }

            if (escolha.equals("B")) {
                System.out.println("Escolha o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println("Escolha o segundo número: ");
                int num2 = sc.nextInt();
                int resultado = subtrair(num1, num2);
                System.out.println("O resultado é " + resultado);
            }if (escolha.equals("C")){
                System.out.println("Escolha o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println("Escolha o segundo número: ");
                int num2 = sc.nextInt();
                int resultado = multi(num1,num2);
                System.out.println("O resultado é "+ resultado);
            } if (escolha.equals("D")) {
                System.out.println("Escolha o primeiro número: ");
                int num1 = sc.nextInt();
                System.out.println("Escolha o segundo número: ");
                int num2 = sc.nextInt();
                double resultado = xelevy(num1, num2);
                System.out.println("O resultado é "+ resultado);
            } if (escolha.equals("E")){
                System.out.println("Escolha o número: ");
                int ang = sc.nextInt();
                double resultado = seno( ang);
                System.out.println("O resultado é "+ resultado);
            } if (escolha.equals("F")){
                System.out.println("Escolha o número: ");
                int ang = sc.nextInt();
                double resultado = cosseno( ang);
                System.out.println("O resultado é "+ resultado);
            } if (escolha.equals("G")){
                System.out.println("Escolha o número: ");
                int ang = sc.nextInt();
                double resultado;
                  resultado = tangente( ang);
                System.out.println("O resultado é "+ resultado);
            }



        }

    }

    public static int adicionar(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static double xelevy(int num1, int num2 ) {
        return Math.pow(num1, num2);
    }

    public static double seno(double ang) {
        double anguloRadians = Math.toRadians(ang);
        return Math.sin(anguloRadians);
    }

    public static double cosseno(double ang) {
        double anguloRadians = Math.toRadians(ang);
        return Math.cos(anguloRadians);
    }

    public static double tangente(double ang) {
        double anguloRadians = Math.toRadians(ang);
        return Math.tan(anguloRadians);
    }
}
