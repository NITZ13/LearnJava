class Sync{
	int c=0;
	public synchronized void  count(){
 
		c++;
	}
}

public class SyncDemo {

	public static void main(String[] args) throws Exception {
     Sync obj1=new Sync();
     Thread t1=new Thread(new Runnable () {
    	 public void run() {
    		 for(int i=0;i<100;i++)
    		 {obj1.count();}
    	
    	}
    	 
     });
     Thread t2=new Thread(new Runnable () {
    	 public void run() {
    		 for(int i=0;i<100;i++)
    		 {obj1.count();}
    	 }
     });
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	System.out.println("Count "+ obj1.c);
	}

}
