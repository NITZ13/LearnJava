class AAA{
	public void show() {
		System.out.println("in AAA");
	}
}
class BBB extends AAA
{
	public void show() {
		System.out.println("in BBB");
	}
}
class CCC extends AAA
{
	public void show() {
		System.out.println("in CCC");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           AAA obj= new BBB(); //RUNTIME POLYMORPHISM
           obj.show();
           obj =new CCC();
           obj.show();//Dynamic method dispatch
           
	}

}
