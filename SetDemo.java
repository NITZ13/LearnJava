import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
   Set<Integer> s=new HashSet/*hashing using heap memory*/<>();//only takes distinct elements
   s.add(7);
   s.add(17);

   s.add(6);

   s.add(5);

   s.add(7);

   s.add(0);
   Iterator it=s.iterator();
   for(int i : s) {
	   System.out.println(it.next());
   }
   System.out.println();
   Set<Integer> st=new TreeSet<>();//prints values in sequence as input
   
   Iterator itt=s.iterator();
   for(int i : s) {
	   System.out.println(itt.next());
   }
	}

}
