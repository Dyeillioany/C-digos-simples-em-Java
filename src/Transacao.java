public class Transacao {
    public static void realizarTransacao(ContaBancaria conta, double valor, String tipo) {
        if (tipo.equalsIgnoreCase("DEPOSITO")) {
            conta.deposito(valor);
        } else if (tipo.equalsIgnoreCase("SAQUE")) {
            conta.saque(valor);
        } else {
            System.out.println("Tipo de transação inválido.");
        }
    }
}