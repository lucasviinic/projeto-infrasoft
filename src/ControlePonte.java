public class ControlePonte {
    public static void main(String[] args) {
        PonteControle ponteControle = new PonteControle();
        Thread carro1 = new Thread(new Carro(ponteControle, "Esquerda para Direita"));
        Thread carro2 = new Thread(new Carro(ponteControle, "Direita para Esquerda"));

        carro1.start();
        carro2.start();
    }
}