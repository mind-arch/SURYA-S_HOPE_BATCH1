public class ThreadImplementation extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadImplementation thread1 = new ThreadImplementation();
        ThreadImplementation thread2 = new ThreadImplementation();

        thread1.start();
        thread2.start();
        thread2.setName("Second Thread");
        thread1.setName("First Thread");
        try {
            thread1.join(); // Wait for thread1 to finish before starting thread2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(1000); // Sleep for 1 second before starting thread2
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}