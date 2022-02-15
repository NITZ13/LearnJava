interface Writer
{
	/*public abstract*/void write(); //no need to mention it as it presumes it
	//unlike abstract class you can only declare methods here and not define
}
 class Pen /* extends Abc*/ implements Writer //extends can be also used to extend abstract class along with it 
//can have multiple implements of interfaces which is helpful to give it to another coder and he/she will just implement it 
 {
	 public void write() {
		 System.out.println("PEN");
	 }
 }
 class Pencil implements Writer{
	 public void write() {
		 System.out.println("Pencil");
	 }
 }

class Kit{
 public void doSomething(Writer p) //no need to create obj of abstract/interface class Writer
 {
	 p.write();
 }

}
public class InterfaceDemo {

	public static void main(String[] args) {
     Kit p= new Kit();        //obj of class that contains method
     Writer pen=new Pen();      //obj of pen
     Writer pencil=new Pencil();  //obj of pencil
     p.doSomething(pencil);  //calls method in kit with obj of pencil which is passed to interface writer which then is implemented in pencil
	}

}
