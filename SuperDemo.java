class A //SUPER
{
	public  A() //constructor
	{
		System.out.println("in A");
	}
}
class B extends A //inherits constructor of A
{
	public  B() //constructor
	{
		System.out.println("in B");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		B obj=new B(); //constructor is called here,no need to separately call
		

	}

}
