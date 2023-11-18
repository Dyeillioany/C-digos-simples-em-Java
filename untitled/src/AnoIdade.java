import java.util.Scanner;
public class AnoIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Qual o seu nome: ");
    String nome= sc.next();
    System.out.println("Em qual ano você nasceu? ");
    int ano = sc.nextInt();
    int conta = 2023 - ano;
    boolean conta1 = conta >= 18;
    System.out.println("É maior de idade? " + conta1);


    }
}
