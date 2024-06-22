public class Carro implements Runnable {
    private final PonteControle ponteControle;
    private final String direcao;

    public Carro(PonteControle ponteControle, String direcao) {
        this.ponteControle = ponteControle;
        this.direcao = direcao;
    }

    public void run() {
        try {
            System.out.println("Carro indo " + direcao + " está tentando entrar na ponte.");
            ponteControle.entrarPonte();
            System.out.println("Carro indo " + direcao + " está atravessando a ponte.");
            Thread.sleep(2000); // Simula tempo de travessia
            System.out.println("Carro indo " + direcao + " saiu da ponte.");
            ponteControle.sairPonte();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}