public class ContaCorrente extends ContaBancaria {
    private double taxaDeOperacao;
    public ContaCorrente(Cliente titular, double saldoInicial, double taxaDeOperacao) {
        super(titular, saldoInicial);
        this.taxaDeOperacao = taxaDeOperacao;
    }
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaDeOperacao;
        super.saque(valorComTaxa);
    }
}