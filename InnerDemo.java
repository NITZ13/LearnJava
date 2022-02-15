

/*
 * inner class is of three types
 * Member class
 * Static class
 * Anonymous class
 * 
 */


class Outer{
	int a;
	public void show() {
		
	}
	class Inner          //class inside class
	{
		public void display()
		{
			System.out.println("in inner");
		}
	}
	static class inner2{
		public void display2() {
			System.out.println("in inner2");
		}
	}
}


public class InnerDemo {

	//inside a class we can variable and methods
	public static void main(String[] args) {
      Outer obj= new Outer();
      Outer.Inner obj1= obj.new Inner();   //call using obj of parent class
      obj1.display();
      Outer.inner2 obj2= new Outer.inner2(); //no need of specifying obj of outer as static, so just ref outer
      obj2.display2();
      
	}

}
