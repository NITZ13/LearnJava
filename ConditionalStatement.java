
public class ConditionalStatement {

	public static void main(String[] args) {
		int m,n=7,swi=5;
		if(n%2==0) 
			System.out.println("Even");
		
		else if(n==0) System.out.println("given num is 0");
		else System.out.println("odd");
		
		//TERNARY OPERATOR
		//var=condition?exp1:exp2
		m=n>8?1:0;
		/*if n>8
		 * m=1
		 * else m=0
		 */
		System.out.println(m);
		
		
		switch(swi)/*switch variable cannot be char,double||
		BUT
		|| String can be used in switch from java 1.7 onwards*/
		{
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println(4);
			break;
		default : System.out.println("greater than 4");
			
		
}
	}

}
