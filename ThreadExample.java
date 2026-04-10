class MyThread extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                Thread.sleep(500); 
            } 
	    catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();        
	t1.start();     }
}