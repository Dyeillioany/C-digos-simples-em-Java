import java.util.Scanner;


public class ImcCalculador {
    public static void main(String[] args) {
        // Scanner é uma classe usada para capturar dados pelo terminal
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso: ");
        float peso = sc.nextFloat();
        // capturar peso pelo terminal
        System.out.println("Informe sua altura: ");
        float altura = sc.nextFloat();
        // capturar altura pelo terminal

        float imc = peso / (altura * altura);
        //mostra o imc
        System.out.println("Seu IMC é " + imc);
    }
}
