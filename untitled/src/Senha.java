import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira senha para verificação:" );
        int combinacaoUm = sc.nextInt();
        System.out.println("Digite a segunda senha: ");
        int combinacaoDois = sc.nextInt();
        boolean senhas = combinacaoUm == combinacaoDois;
        System.out.println(senhas);

    }
}
