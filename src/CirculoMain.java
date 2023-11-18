import java.util.Scanner;

public class CirculoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual seu raio ");
        double raio = sc.nextDouble();

        // Cria um objeto Circulo com o raio que o usuario fornece
        Circulo circulo = new Circulo(raio); //objeto

        // Calcula a área e o perímetro
        circulo.calculaArea();
        circulo.calculaPerimetro();

        // Exibe os resultados
        System.out.println("Area: " + circulo.areaRetorno());
        System.out.println("Perimetro: " + circulo.perimetroRetorno());
    }
}