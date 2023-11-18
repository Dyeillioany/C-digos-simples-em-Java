import java.util.Scanner;

public class FulanoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = sc.next();
        System.out.println("Digite o ano que você nasceu: ");
        int ano = sc.nextInt();
        int conta = 2023 - ano;
        System.out.println("Olá " + nome + " você tem " + conta + " anos");
    }
}
