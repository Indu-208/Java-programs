class SharedResource { 
    synchronized void display(int n) { 
        for (int i = 1; i <= 5; i++) { 
            System.out.println(n * i); 
            try { 
                Thread.sleep(500); 
      } catch (InterruptedException e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
} 
class SyncThread extends Thread { 
    SharedResource obj; 
     
    SyncThread(SharedResource obj) { 
        this.obj = obj; 
    } 
     
    public void run() { 
        obj.display(5); 
    } 
} 
        
public class ThreadSynchronization { 
    public static void main(String[] args) { 
        SharedResource obj = new SharedResource(); 
        SyncThread t1 = new SyncThread(obj); 
        SyncThread t2 = new SyncThread(obj);
	t1.start(); 
        t2.start(); 
    } 
} 