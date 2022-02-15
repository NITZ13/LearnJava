class AA{
	public void show()
	{
		System.out.println("in A");
	}
}
class BB extends AA{
	@Override   //its better to specify this as if sometimes logical error happens and instead of method of B,Method of A is called it would cause a problem
	public void show()
	{
		System.out.println("in BB");
	}
}

public class OverridingDemo {

	public static void main(String[] args) {
       BB obj=new BB();
       obj.show();  //show method of A overriden by show method of B
	}

}
