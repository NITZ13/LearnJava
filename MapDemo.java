import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
Map<String,String> m= new HashMap<>();//used to take data in KEY,VALUE pair
m.put("Myname","Nitesh" );
m.put("ceo","Mukesh A" );
m.put("Company","Jio" );
System.out.println(m);
System.out.println(m.get("ceo")); // to get specific value of that key
//to get key plus name in proper sequence
Set <String> keys= m.keySet();
for(String Key : keys) {
	System.out.println(Key + " " +m.get(Key));
}
	}

}
