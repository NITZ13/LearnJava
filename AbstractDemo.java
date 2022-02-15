abstract class Human //Abstract class: cannot create object of this class
{
	
	public abstract void eat(); /*in ONLY ABSTRACT class we can declare abstract method*/
	public void walk() {
		
	}
}

class Man extends Human   //when a class extends abstract class, its called CONCRETE class
{
public void eat()          //it is compulsory to define the abstract method declared in abstract class
{
	System.out.println("lets eat");
}	

}

//why abstract class??
class Printer{
	public void show(Integer i) //Integer wrapper class 
	{
		System.out.println(i);
	}
	
	//for double value we have to create another method with Double wrapper class
	public void show(Double i) //Double wrapper class 
	{
		System.out.println(i);
	}
	
	//Integer and Double wrapper class extend super ABSTRACT CLASS Number
	//Number is abstract class because we can make obj only of wrapper class like int and double and not Number itself
	//so if we use super class number directly then it includes both Int and Doub
	public void display(Number  i) //Number Abstract wrapper class 
	{
		System.out.println(i);
	}
	
}

//we can create such logic of our own
/*abstract class Write{
	public abstract void w(String i);
}
class Pen extends Write{
	public void w(String i) {
		System.out.println(i);
	}
}
class Pencil extends Write{
	public void w(String i) {
		System.out.println(i);
	}
}*/
//both pencil and pen are used for writing so it makes sense
public class AbstractDemo {

	public static void main(String[] args) {
        // Human obj=new Human(); will give error as abstract class obj cannot be created
		Human /*reference*/ obj= new Man();
		obj.eat();
		
		Printer p=new Printer();
		p.show(5);
		p.show(5.5);
		p.display(5);
		p.display(5.5);
	}

}
