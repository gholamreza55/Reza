package thread;

public class MyThread extends Thread{

    @Override
    public void run() {
        int iteration = 3;
        try {
            for (int i = 0; i < iteration; i++) {
                System.out.println("From secondary Thread");
            }
            sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread Interupted");

        }
    }
}
