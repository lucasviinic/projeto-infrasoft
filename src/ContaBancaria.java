import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class ContaBancaria {
    private double saldo;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition saldoSuficiente = lock.newCondition();

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void deposito(double quantia) {
        lock.lock();
        try {
            saldo += quantia;
            saldoSuficiente.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void saque(double quantia) {
        lock.lock();
        try {
            while (saldo < quantia) {
                saldoSuficiente.await();
            }
            saldo -= quantia;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public double getSaldo() {
        lock.lock();
        try {
            return saldo;
        } finally {
            lock.unlock();
        }
    }
}