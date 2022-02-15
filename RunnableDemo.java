class Yo implements Runnable //using runnable interface we can create threads aswell
{
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("Yo");
     try{Thread.sleep(500);} //makes thread wait for 500ms before executing next time;try catch because sleep contains exception
		catch(Exception e) {
		}
	}}
	}
class Yolo implements Runnable
{
	public void run(){
		for(int i=0;i<=5;i++) {
			System.out.println("Yolo");
     try{Thread.sleep(1000);} //makes thread wait for 500ms before executing next time;try catch because sleep contains exception
		catch(Exception e) {
		}
	}}
	}
public class RunnableDemo {

	public static void main(String[] args) throws Exception {
   Runnable obj1=new Yo();
   Runnable obj2=new Yolo();
    Thread t1=new Thread(obj1); //create thread object using the obj of the method class we want
    Thread t2=new Thread(obj2);
    t1.start();
    t1.setName("This is yo thread");//use to set thread name
    System.out.println(t1.getName());//by default thread 0, thread 1 and so on
    try{Thread.sleep(10);} catch (Exception e) {}
    t2.start();
    System.out.println(t1.isAlive()); //rreturns true if thread alive
    t1.join();//after writing this ,it will show error,click on suggestion,add throws exception
    t2.join();//this join makes sure that Main thread will be executed in the end
   System.out.println(t1.isAlive());//after join thread dies 

    System.out.println("Bye");//if only this line present after start it would result in print of bye in between ece of two threads as it is main thread
	}

}
