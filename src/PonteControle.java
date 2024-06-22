import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class PonteControle {
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition ponteLivre = lock.newCondition();
    private boolean ponteOcupada = false;

    public void entrarPonte() {
        lock.lock();
        try {
            while (ponteOcupada) {
                ponteLivre.await();
            }
            ponteOcupada = true;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public void sairPonte() {
        lock.lock();
        try {
            ponteOcupada = false;
            ponteLivre.signalAll();
        } finally {
            lock.unlock();
        }
    }
}