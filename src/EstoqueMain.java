public class EstoqueMain {
    public static void main(String[] args) {
        EstoqueProduto produto1 = new EstoqueProduto("Roupa", 259, "Bloco C");
        EstoqueTransacaoProduto transacaoProduto = new EstoqueTransacaoProduto("Geladeira", 10);
        EstoqueCategoriaProduto categoriaProduto = new EstoqueCategoriaProduto("Eletrônico", "setor B");

        System.out.println("Produto " + produto1.nome + " está saindo por R$" + produto1.valor + "e está localizado no " + produto1.localizacao );
        System.out.println("Produto " + transacaoProduto.nome + " está saindo por " + transacaoProduto.valor);
        System.out.println("Produtos da categoria  " + categoriaProduto.categoria + " está localizado no " + categoriaProduto.local);
    }

}

/*
public class BancoMain {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Dyei", "000.000.000.00");
        ContaCorrente contaCorrente = new ContaCorrente(cliente1, 1000.0, 2.0);
        ContaPoupanca contaPoupanca = new ContaPoupanca(cliente1, 500.0, 0.02);
        Transacao.realizarTransacao(contaCorrente, 200.0, "DEPOSITO");
        Transacao.realizarTransacao(contaCorrente, 50.0, "SAQUE");
        Transacao.realizarTransacao(contaPoupanca, 100.0, "DEPOSITO");
        contaPoupanca.aplicarJuros();
        System.out.println("Saldo final da Conta Corrente: R$ " + contaCorrente.getSaldo());
        System.out.println("Saldo final da Conta Poupança: R$ " + contaPoupanca.getSaldo());
    }
}
 */