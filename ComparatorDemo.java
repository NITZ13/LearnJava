import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		  List<Integer> li=new ArrayList<>(); //GENERIC <> ISused to specify specific DATATYPE
		     //li.add(0, li); index,element ,,,this enables user to add value or fetch value using indexing
		     li.add(155);
		     li.add(367);
		     li.add(64);
		     li.add(990);
		     li.add(24);
		     //now suppose we want to add "2" between 1 and 3
		     
		     li.add(1, 56); //adds value 2 at index 1
		     //collections class have several methods, sort is one of them
		     Comparator<Integer> c=new Comparator<Integer>() {
		    	 public int compare(Integer i, Integer j) {
		    		 if(i%10>j%10)//sort on unit digit 
		    		 {
		    			 return 1;
		    		 }
		    		 else {return -1;}
		    	 }
		     };
		     Collections.sort(li, c);
		     System.out.println(li);

	}

}
