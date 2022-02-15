import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//Read theory from notes
public class CollectionDemo {

	public static void main(String[] args) {
    Collection val=new ArrayList(); //Collection interface ref,obj of ArrayList interface which implements Collection
    val.add(1); //to add values using wrapper classes
    val.add(2); //Integer v=new Integer(2), so 2 here is OBJECT
    val.add(1);
    val.add("STRING");
     //In collection we can add any type of data
    System.out.println(val); //will print all values at once,we cant print individual values as indexing is not supported in collection
	//so as to print them separately we use Iterator Interface\
    Iterator it=val.iterator(); //Iterator interface creating obj of collection obj
   // System.out.println(it.next()); //prints next val,here it will print 1st val
    //System.out.println(it.next()); //prints next val,here it will print 2nd val
	while(it.hasNext()) {
	    System.out.println(it.next()); 
	}
	}

}
