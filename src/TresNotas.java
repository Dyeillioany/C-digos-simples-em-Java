import java.util.Scanner;
public class TresNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas = 0;
        for (int i = 1; i <=3; i++){
            System.out.println("Digite suas notas: ");
            float nota = sc.nextFloat();
            notas = notas + nota;
        }
        float media = notas/3;
        boolean tresNotas = media > 6;
        System.out.print("aprovado? " + tresNotas );


    }
}

