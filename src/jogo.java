import java.util.Random;
import java.util.Scanner;

public class jogo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        {
            Random random = new Random();
            int num_aleatorio = random.nextInt(100)+1;
            int tentativas = 0;
            boolean acerto = false;

            System.out.println("Chute um número de 1 a 100 para começar o jogo. Boa sorte!");

            while (!acerto) {
                System.out.println("Digite sua tentativa");
                int tentativa = sc.nextInt();
                tentativa ++;

                if (tentativa == num_aleatorio){
                    acerto = true;
                    System.out.println("Parabéns! Você acertou.");
                }else if(tentativa < num_aleatorio){
                    System.out.println("Você errou. Tente um número maior");
                }else{
                    System.out.println("Você errou. Tente um número menor.");
                }


            }

        }

    }
}
