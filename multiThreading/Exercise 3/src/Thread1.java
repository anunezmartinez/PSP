public class Thread1 extends Thread{
    public Thread1(String name) {
        super(name);
    }
    public static int cont=0;
    @Override
    public void run() {
        Thread1 h1;
        for (int cont = 0; cont < 6; cont++) {
            System.out.println("Thread Started");
            h1 = new Thread1("hilo" + cont);
            h1.start();
            for (int i = 0; i < 10; i++) {
                System.out.println("Proccesing " + h1.getName());
            }
            try {
                sleep((int) (Math.random() * 600) +1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            try {
                h1.join();
                System.out.println(h1.getName() + " ended");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(getName() + " ended");
    }
}
