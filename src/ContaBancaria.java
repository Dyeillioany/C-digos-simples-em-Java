public class ContaBancaria {
    private Cliente titular;
    protected double saldo;
    public ContaBancaria(Cliente titular, double saldoinicial) {
        this.titular = titular;
        this.saldo = saldoinicial;
    }
    public void deposito(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
    }
    public void saque(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado. Novo saldo: R$ " + saldo);
        }
    }public double getSaldo() {
        return saldo;
    }
}