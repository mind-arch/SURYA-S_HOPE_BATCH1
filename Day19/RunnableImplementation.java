public class RunnableImplementation implements Runnable {
    @Override
    public void run() {
        System.out.println("Running in a separate thread!");
    }

    public static void main(String[] args) {
        RunnableImplementation runnable = new RunnableImplementation();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}