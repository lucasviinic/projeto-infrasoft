public class CarroSemControle implements Runnable {
    private final PonteSemControle ponteSemControle;
    private final String direcao;

    public CarroSemControle(PonteSemControle ponteSemControle, String direcao) {
        this.ponteSemControle = ponteSemControle;
        this.direcao = direcao;
    }

    public void run() {
        ponteSemControle.atravessarPonte(direcao);
    }
}