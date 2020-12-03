package company;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 h1 = new Thread1("Primer hilo");
        Thread1 h2 = new Thread1("Segundo hilo");
        h1.start();
        h1.join();
        h2.start();
        h2.join();

    }
}
