class Ann{
	public void show() {
		System.out.println("in class Ann");
	}
}

//Interface with anonymous class
interface  Ia{
	void show1();
}

public class AnonymousDemo {

	public static void main(String[] args) {
     Ann obj=new Ann() {
    	 public void show() {
    			System.out.println("in Anonymous class ");
    		
     }
    	 };
     // Anonymous class created here,to do method overriding
     obj.show();	//this will call anonymous class defined method ie overriding class Ann
	
    Ia obj1=new Ia() //here we defined method on interface using anonymous class,hence no need of implementing class
                   {
    	public void show1() {
    		System.out.println("interface with java");
    	}
    };
    obj1.show1();
	}
}
