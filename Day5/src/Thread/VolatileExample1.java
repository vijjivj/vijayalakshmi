package Thread;


public class VolatileExample1 {

    private volatile Boolean isRunning = true;

    public void run() {
        while (isRunning) {

        	System.out.println("thread is running");  
        }
    }

    public void stop() {
        isRunning = false;
    }

    public static void main(String[] args) {

        VolatileExample1 example = new VolatileExample1();

        Thread thread = new Thread(example::run);

        thread.start();


        // wait for some time

       try {

           Thread.sleep(5);

       } catch (InterruptedException e) {

           e.printStackTrace();

        }


        example.stop();

    }

}




