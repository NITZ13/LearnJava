
public class JumpDemo {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			if(i==7) {
				continue;//jumps to outside of for function for 7,used for SKIPPING iteration
			}
			System.out.println("value is "+ i);
		}
		
		for(int j=1;j<11;j++) {
			if(j>5) {
				break;//comes out of for loop,BREAK the loop
			}
			System.out.println("value is "+ j);
		}
	}

}
