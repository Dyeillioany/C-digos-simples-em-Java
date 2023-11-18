import java.util.Scanner;

public class EmailsIguais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu email: ");
    String a = sc.next();
    System.out.println("Digite sua senha: ");
    int senha1 = sc.nextInt();
    System.out.println("Confirme seu email: ");
    String b = sc.next();
    System.out.println("Confirme sua senha: ");
    int senha2 = sc.nextInt();
    boolean ab = a.equals(b);
    boolean senhas = senha1 == senha2;
    System.out.println("Email confirmado: " + ab);
    System.out.println("Senha confirmada: "+ senhas);

    }
}

