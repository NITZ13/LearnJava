
class Calculator{
	//Object knows something
	int num1;
	int num2;
	int result;//Default value 0
	
	//Object does something
	public void perform()
	{
		result=num1 +num2;
	}
	
}
public class ObjectDemo {

	public static void main(String[] args) {
		Calculator obj; //class reference
		obj = new Calculator();//Constructor,obj is just reference
        //Object knows something and Object does something
		obj.num1 = 3 ;
		obj.num2 = 5 ;
		obj.perform();//function call
		System.out.println(obj.result);
	}

}
