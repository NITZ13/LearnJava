
public class ExceptionDemo {

	public static void main(String[] args) {
        // int i=9/0;
        /*Exception in thread "main" java.lang.ArithmeticException: / by zero*/
        System.out.println("no mistake on mine");
        //Because there exists an exception above,even though the code lines underneath are error less they wont execute
         //so its our duty as dev to handle exceptions
        try  //Includes critical statements,throws exceptions
        {
        	int j= 9/0;
        }
        
        catch(Exception e ) //Object created of exception thrown by try
        {
        	System.err/*red color*/.println("error found");  //used for exception handling
        }
        System.out.println("no mistake on mine");
	
        try  //Includes critical statements,throws exceptions
        {
        	int l= 9;
        	int m= 3;
        	int n=l/m;
        	System.out.println(n);  //no error so will print

        }
        
       //catch(ArithmeticException e ) //Object created of exception thrown by try
       // {
       // 	System.err/*red color*/.println("error found");  //used for exception handling
       // }
	    
        //Try either needs finally or catch block
        finally //here the code gets executed independent of whether exception found or not
        {
        	System.out.println("no mistake in me");
        }
	
	
	
	
	}
	
	

}

