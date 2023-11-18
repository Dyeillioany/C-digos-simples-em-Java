import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notas =0 ;
       for(int i = 1;i<=4;i++){
           System.out.printf("digite sua nota");
           float nota= sc.nextFloat();
           notas+=nota;
       }
       float media = notas/4;
        System.out.printf("media e "+media);


        }
    }
