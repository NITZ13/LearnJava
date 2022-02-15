
public class FirstCode {
	public static void main(String args[])
	{
		String str1="hello world";
		String str2="hello nice";
		System.out.print(str1+ "\n"+str2+"\n"); /*newline via \n*/
		System.out.println("hhh");
		System.out.println(5);/*newline via println*/
		System.out.println(str1);
		int a,b;
		a=5;b=10;
		b=20;
		int c=a*b;
		int h9_h$=9;
		System.out.println(h9_h$);
		System.out.println(c);
		double d=5.5;   /*BYE DEFAULT IN JAVA DOUBLE*/
		System.out.println(d);
		Float f=5.5f;
		System.out.println(f);
		/*datatype significance in terms of memory*/
		int abc=5; /*int takes 4 bytes*/
		short s=5; /*short for the same data takes 2 bytes*/
		/*use short when the number lies between range -32768 to 32767*/
		byte b1=5; /*byte for the same data takes 1 byte*/
		/*use byte when the number lies between range -128 to 127*/
		
		char ch='A';
		ch=66;  /*ASCII value of B*/
		System.out.println(ch);
		
		 /*IMPLICIT CONVERSION*/
		double dd=5;
		System.out.println(dd);
		 /*TYPE CASTING*/
		int k=(int)5.6;
		System.out.println(k);

	} 

}
