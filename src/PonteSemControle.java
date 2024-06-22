public class PonteSemControle {
    public void atravessarPonte(String direcao) {
        try {
            System.out.println("Carro indo " + direcao + " está atravessando a ponte.");
            Thread.sleep(2000);
            System.out.println("Carro indo " + direcao + " saiu da ponte.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}