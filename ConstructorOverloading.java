
class Calc{
	//Object knows something
	int num1;
	int num2;
	int result;//Default value 0
	
	public Calc()                                    //Constructor1
	{
		
		num1=5;
		System.out.println("in costructor");
		
	}
	
	public Calc(int n)                             //Constructor2 with different parameter
	{
		
		num1=n;
		
		
	}
	
	public Calc(int num1, int num2)                 //Constructor3 with different parameter
	{
		
		this.num1=num1;                             //this. keyword specifies instance variable
		
		
	}
	
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Calc obj= new Calc(7,5);                    // Constructor
        System.out.println(obj.num1);
        Calc obj1= new Calc();           // Constructor

	}

}
