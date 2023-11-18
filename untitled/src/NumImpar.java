import java.util.Scanner;

public class NumImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero: ");
        int numero = sc.nextInt();
        boolean ehpar = numero % 2 == 0; // Corrigido aqui
        System.out.print("É par? " + ehpar); // Corrigido aqui
    }
}