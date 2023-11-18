import java.util.Scanner;

public class QuatroNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Digite sua nota");
            float nota = sc.nextFloat();
            notas += nota;

        }
        float media = notas / 4;

        if (media < 4) {
            System.out.println("Reprovado!");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 4 || media < 7) {
            System.out.println("Recuperação!");
        }

    }

}
