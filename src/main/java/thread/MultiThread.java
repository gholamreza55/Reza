package thread;

public class MultiThread extends Thread{
    private int threadNumber;

    public MultiThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(i + " Thread from " + threadNumber);
            if (threadNumber == 0)
                throw  new RuntimeException();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            MultiThread myThing = new MultiThread(i);
            myThing.start();
        }

    }
}
