
class Emp{
	int eid;
	int salary;
	static String ceo;  //static keyword is used in case where records share common record value, eg.ceo

   static                //executed only once while class loading
   {
	   //eid= 100; non static var cannot be used in static block
	   ceo= "Fury";
	   System.out.println("in static");
   }	
   
   public Emp()            //constructor will execute 2nd time here 
   {
	   System.out.println("in constructor");
   }
	
	public void show() {
	System.out.println(eid +" : " + salary + " : " + ceo);
}

}



public class StaticDemo {

	public static/*static here ensures to run this main without creating a object of it because to create a object first you need to run program */ void main(String[] args) {
		Emp john= new Emp();
		john.eid=1;
		john.salary=50000;
		Emp.ceo= "Fury";      //static var have class name has object name 
		
		Emp tyson= new Emp();
		tyson.eid=2;
        tyson.salary=60000;
		
		System.out.println(Emp.ceo);//static variable can be printed/accessed even before the object is created because of static reference
		System.out.println(john.salary);
		john.show();
		tyson.show();
		
	}

}
