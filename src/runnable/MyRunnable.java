package runnable;

public class MyRunnable implements Runnable{
    private Thread t;
    private String threadName;

    public MyRunnable(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName  );
    }
    @Override
    public void run() {
        System.out.println("Creat:" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + "," + i);
                Thread.sleep(50);
            }
        }catch(InterruptedException e) {
            System.out.println("Thread: " + threadName + "InterruptedException" );
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start(){
        System.out.println("\"Starting \" + threadName");
        if(t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
}
