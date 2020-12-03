package company;

public class Thread1 extends Thread{
    public Thread1(String name) {
        super(name);
    }

    @Override
    public void run() {
        int time = (int)(Math.random()*1000+1);
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteración : " + i);
            System.out.println(getName());
            try {
                Thread1.sleep(time);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



}
}
