public class ContaPoupanca extends ContaBancaria {
    private double taxaDeJuros;
    public ContaPoupanca(Cliente titular, double saldoInicial, double taxaDeJuros) {
        super(titular, saldoInicial);
        this.taxaDeJuros = taxaDeJuros;
    }
    public void aplicarJuros() {
        saldo *= (1 + taxaDeJuros);
        System.out.println("Juros aplicados. Novo saldo: R$ " + saldo);
    }
}