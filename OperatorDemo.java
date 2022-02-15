
public class OperatorDemo {
	/*
	 * Arithmetic
	 * Bitwise
	 * Relational 
	 * Logical
	 */
	public static void main(String[] args) {
		int m=6,n=4,a=2,b=8;
		int r1=n-m;
		int r2=m*n;
		double r3=m/n;/*op should've been 1.5 but m,n being int; op came as 1 so
		 we need typecasting*/
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);

		double r4=(double)m/n;
		System.out.println(r4); //type casting ans is 1.5
		
		int r5=n^m;//this does not work as exponential operator
		System.out.println(r5);
		
		int r6=m%n; //remainder
		System.out.println(r6);
		
		n+=3;//shorthand operator
		n++;
		System.out.println(n);
		
		a=++b;
		System.out.println(a);//9
		b=8;
		a=b++;
		System.out.println(a);//9


	}

}
