/*By default there exists atleast one thread which is created by main method
 * */
class Hi extends Thread //Extends thread class java
{
	public void run() //method name should be run because its internal method of thread
	{
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
     try{Thread.sleep(500);} //makes thread wait for 500ms before executing next time;try catch because sleep contains exception
		catch(Exception e) {
		}
	}
		}
}
class Hello extends Thread
{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
     try{Thread.sleep(1000);} //makes thread wait for 1000ms before executing next time;try catch because sleep contains exception
		catch(Exception e) {
		}
	}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
    Hi obj1=new Hi();
    Hello obj2=new Hello();
    obj1.start();
    /*start here starts execution of that thread, this enables execution of two threads/methods
     * to execute concurrently */
    //EXECUTE TO SEE, ALSO TRY TO REPLACE START WITH RUN AND THEN EXECUTE
    obj2.start();
	}

}
