public class Thread extends java.lang.Thread {
    public Thread(String name){
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " "+ getName());
            System.out.println(getName() + "ended");
        }
    }
}
