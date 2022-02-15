import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
     List<Integer> li=new ArrayList<>(); //GENERIC <> ISused to specify specific DATATYPE
     //li.add(0, li); index,element ,,,this enables user to add value or fetch value using indexing
     li.add(1);
     li.add(3);
     li.add(4);
     li.add(0);
     li.add(2);
     //now suppose we want to add "2" between 1 and 3
     
     li.add(1, 2); //adds value 2 at index 1
     //collections class have several methods, sort is one of them
     Collections.sort(li); //sorts the elements
     Collections.reverse(li);//reverses list
     //HENCE LIST IS CALLED MUTABLE AS WE CAN CHANGE STRUCTURE OF IT
     System.out.println(li);
     
     Iterator it=li.iterator();
     while(it.hasNext()) {
    	 System.out.println(it.next());
    	 System.out.println();
     }
     //using iterator is still confusing but here we can use for loop as we have indexing and also method to get size of list 
	for(int i=0;i<li.size();i++) {
		System.out.println(li.get(i));//get method is used to get values  individually
	}
	
	
	}

}
