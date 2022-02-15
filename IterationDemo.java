
public class IterationDemo {

	public static void main(String[] args) {
		int f,w=1;
		do
		{
			System.out.println("yo");
			w++;
		}while(w<=5);
		
		for(f=1;f<6;f++) {
		 System.out.println("f");	
		}
//use for loop when you know range of input,while when you know only end val of range
		
		//NESTED LOOP FOR PATTERNS
		/* 
		 ****
		 ****
		 ****
		 ****
		 */
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				System.out.print(j + " ");//this is called concatenation
			} System.out.println();
		}
		System.out.println();
		/* 
		 ****
		 ***
		 **
		 *
		 */
		for(int k=1;k<5;k++) {
			for(int l=5;l>k;l--) {
				System.out.print("* ");
			} System.out.println();
		}
	}

}
