import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que deseja fazer a tabuada: ");
        int num = sc.nextInt();
        int tabuada = 1;
        for (int i = 1; i <=10; i++ ){
             tabuada = num * i;
            System.out.println(num + " x " + i + " = " +  tabuada);
        }

    }
}
