import java.util.Scanner;

public class IdadeNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.next();
        System.out.println("Digite o ano de seu nascimento: ");
        int idade = sc.nextInt();
        int conta = 2023 - idade;
        System.out.println("Olá "+ nome + " você tem "+ conta + " anos");


    }
}