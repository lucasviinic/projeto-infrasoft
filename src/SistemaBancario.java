public class SistemaBancario {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000.0);

        Thread t1 = new Thread(new Pessoa(conta, false, 500.0));
        Thread t2 = new Thread(new Pessoa(conta, true, 700.0));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Saldo final: " + conta.getSaldo());
    }
}