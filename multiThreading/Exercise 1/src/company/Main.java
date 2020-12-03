package company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Thread1 h1 = new Thread1("Primer hilo");
    Thread1 h2 = new Thread1("Segundo hilo");


    h1.start();
    h2.start();

    }
}
