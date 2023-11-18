import java.util.Scanner;

public class NotaTerminal {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota1 = 6;
    int nota2 = 9;
    int nota3 = 5;
    int media = (nota1 + nota2 + nota3)/3;
    boolean medias = media >=7;
    System.out.println("Aprovado? " + medias);
    }
}
