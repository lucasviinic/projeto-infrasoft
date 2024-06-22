public class SemControlePonte {
    public static void main(String[] args) {
        PonteSemControle ponteSemControle = new PonteSemControle();
        Thread carro1 = new Thread(new CarroSemControle(ponteSemControle, "Esquerda para Direita"));
        Thread carro2 = new Thread(new CarroSemControle(ponteSemControle, "Direita para Esquerda"));

        carro1.start();
        carro2.start();
    }
}