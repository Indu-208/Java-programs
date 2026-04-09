class MyTask implements Runnable {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class Main {
    public static void main(String[] args) {
		MyTask task = new MyTask();        
        	Thread thread = new Thread(task);
        	thread.start();
    }
}