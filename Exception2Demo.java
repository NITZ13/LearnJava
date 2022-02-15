
public class Exception2Demo {

	public static void main(String[] args) {
     int i=2;
     int j= 3;
     try {
         int k=i/j;
         if(k==0) {
        	 throw new MyException("this is not defined");//user defined exception,just write exception name and it will suggest to create class of it
         }
         else System.out.println(k);
     }
     catch(MyException e)
     {
     	 System.out.println("Error " + e.getMessage());// get message used to get string message of exception
     }
	
	
	
	
	}
	
	

}
