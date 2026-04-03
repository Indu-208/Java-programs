class MainThreadExample { 
    public static void main(String[] args) { 
        Thread t = Thread.currentThread(); 
        System.out.println("Default Main Thread: " + t); 
      
        t.setName("PrimaryThread"); 
        t.setPriority(Thread.MAX_PRIORITY);
	System.out.println("Modified Main Thread: " + t); 
    } 
} 