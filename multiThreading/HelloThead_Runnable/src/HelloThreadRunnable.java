public class HelloThreadRunnable implements Runnable {

    Thread t;
    HelloThreadRunnable(){
        t=new Thread(this, "Novo Thread");
        System.out.println("Creado fío:"+t);
        t.start(); //Executes a new thread, starts the run method.
    }
    @Override
    public void run() {
        System.out.println("Thread started");
    }
}
