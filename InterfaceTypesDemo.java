//interface is of 3 types
//1.Normal Interface : An interface which more than 1 Methods
//2.Single abstract interface:only one method
//-also called Functional interface which is used for Lambda expression(derived form Scala)
//3.Marker Interface which contains no methods

@FunctionalInterface //this annotation is used to explicitly make the following interface as Functional Interface
interface Abc{
	void some();
	//void somemore(); will throw error as only one ABSTRACT method allowed 
	//MULTIPLE DEFAULT METHOD ALLOWED
	
	//Since 1.8 java supports method definition inside INTERFACE using DEFAULT
	default void InterfaceMethod() {
		System.out.println("this is default method of interface");
	}
}
class InterfaceImp implements Abc{
	public void some() {
		
	};
	
}

public class InterfaceTypesDemo {

	public static void main(String[] args) {
      Abc obj=() -> System.out.println("fucntional interface");
      /* after" =" ||new Abc(){public void some() || is assumable in funtional interface} 
       *as only one method and only that to be defined so why to wrtie it all?!
       *hence "() ->" this is used to define
       *Called and LAMBDA EXPRESSION 
       * (this came form Scala)
       * */
      obj.some();
      
      Abc obj1=new InterfaceImp();
      obj1.InterfaceMethod();   //as we cannot create obj of interface we create obj of implementing class
	}

}
