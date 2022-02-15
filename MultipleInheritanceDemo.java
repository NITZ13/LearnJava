interface Inter1{
	int i=4; //bydefault INTERFACE VARIABLES have FiNAL Keyword
	default void show()
	{
		System.out.println("Inter1");
	};
}
interface Inter2{
	default void show()
	{
		System.out.println("Inter2");
	};
}
class Inter implements Inter1,Inter2
{
    //just write implement class and then you will get suggestion to either override inter1/inter2
	@Override
	public void show() {
		// TODO Auto-generated method stub
		Inter2.super.show(); //super keyword here states the interface
		//i=5; //variable in interface is final by default hence initialized only once
	}
	
}
//Static method used to save code writing to form separate class and to create obj and then call method inside interface
//using static we just direcly call via InheritanceName.Methodname

interface Static{
	static void shows() {
		System.out.println(" static ");
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
     Inter1 obj=new Inter(); //can use any interface as reference
     obj.show();
     Static.shows();
	}

}
