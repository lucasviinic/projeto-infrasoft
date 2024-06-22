public class Pessoa implements Runnable {
    private final ContaBancaria conta;
    private final boolean eDeposito;
    private final double quantia;

    public Pessoa(ContaBancaria conta, boolean eDeposito, double quantia) {
        this.conta = conta;
        this.eDeposito = eDeposito;
        this.quantia = quantia;
    }

    public void run() {
        if (eDeposito) {
            conta.deposito(quantia);
        } else {
            conta.saque(quantia);
        }
    }
}