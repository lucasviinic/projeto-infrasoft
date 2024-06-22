public class Main {
    public static void main(String[] args) {
        System.out.println("==== Sistema Bancário ====");
        SistemaBancario.main(args);

        System.out.println("\n==== Ponte com Controle ====");
        ControlePonte.main(args);

        System.out.println("\n==== Ponte sem Controle ====");
        SemControlePonte.main(args);
    }
}