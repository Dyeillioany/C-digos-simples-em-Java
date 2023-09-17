import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int erro = 0;
        System.out.println("Maior cidade do Brasil em território:");
        String cidade = sc.next();
        if (cidade.equalsIgnoreCase("Altamira")){
            System.out.println("Ulala, alguém aqui é prestou atenção as aulas!");
            count += 1;
        }else{
            System.out.println("Resposta errada. A maior cidade do Brasil em território é Altamira, no Pará");
            erro += 1;
        }
        System.out.println("Onde está localizado o Canal do Pánama: ");
        String canal = sc.next();
        if (canal.equalsIgnoreCase("Pánama")){
            System.out.println("Isso aí meu chapa!");
            count += 1;
        }else{
            System.out.println("Resposta errada. O Canal do Pánama está localizado no Pánama.");
            erro += 1;
        }
        System.out.println("Quantas regiões tem no Brasil: : ");
        int regiao = sc.nextInt();
        if (regiao == 5){
            System.out.println("Está indo bem, Camarada!");
            count += 1;
        }else{
            System.out.println("Resposta Errada. No Brasil tem 5 Regiões. ");
            erro += 1;
        }
        System.out.println("Ano em que o Brasil foi descoberto: ");
        int ano = sc.nextInt();
        if(ano == 1500){
            System.out.println("Temos aqui um gênio em Geografia");
            count += 1;
        }else{
            System.out.println("Resposta errada. O ano da descoberto do Brasil foi em 1500.");
            erro += 1;
        }
        System.out.println("Qual o oceano que banha o Brasil:");
        String mar = sc.next();
        if (mar.equalsIgnoreCase("Atlântico")){
            System.out.println("Já pode ser sereia!");
            count += 1;
        }else{
            System.out.println("Resposta errada. A respota correta é Oceano Atlântico.");
            erro += 1;
        }
        System.out.println("Quantas estrelas tem na bandeira brasileira:");
        int bandeira = sc.nextInt();
        if (bandeira == 27){
            System.out.println("Contar estrelas da verruga no dedo sabia...");
            count +=1;
        }else{
            System.out.println("Resposta errada. São 27 estrelas.");
            erro +=1;
        }
        System.out.println("Para fechar com chave de ouro, você acertou "+ count+" perguntas.");
        System.out.println("Você errou "+erro+" perguntas.");




        }
}
