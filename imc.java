import java.util.Scanner;mport java.util.Scanner;


public class imc{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        float peso = sc,nexInt();
        System.out.println("Informe sua altura: ");
        float altura = sc.nexInt();

        System.out,println("Seu IMC é " + peso * altura)