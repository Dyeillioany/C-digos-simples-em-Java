import java.util.Scanner;


public class Email {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.next();
        System.out.println("Informe seu email: ");
        String email = sc.next();

        System.out.println("Ola " + nome + "! seu email " + email + " já foi cadastrado");

    }
}