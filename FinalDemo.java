//final variable
class Day{
	final int DAY; 
	public Day() {
		DAY=10;
		// DAY=19; this will show an error as final variable can be initialized once and is kept constant throughout
	}
}
//final class
final class AAAA{
	public final void show() {
		System.out.println("in a");
	}
}
/*class BBBB extends AAAA
{
	
}*/ //WIll throw error because FINAL CLASS is NON INHERITABLE

//final method
 class Af{
	public final void show() {
		System.out.println("in af");
	}
}
class Bf extends Af{
	/*public void show() {
	System.out.println("in b");
	}
	} */ //cannot override show method of final method in Af
}
public class FinalDemo {

	public static void main(String[] args) {
       Day obj=new Day();
       System.out.println(obj.DAY);
       Af obj1=new Af();
       obj1.show();
	}

}
//when a non primitive eg:object is final, you cannot reassign it 