
class Student{
	int rollno;
	String name;
	
}

public class ArrayDemo {

	public static void main(String[] args) {
		int num[]= new int[5]; 
		//array is object in java hence we need to specify how much memory it needs
		//int num[]={20,90,10,20}
        //assigning values to array elements
		num[0]=20;
		num[1]=90;
		num[2]=10;
		num[3]=20;
        
       //printing array element	
		for(int i =0;i<5; i++) {
			System.out.println(num[i] + " ");
		} 
		
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student s4= new Student();
		 Student s[]= {s1,s2,s3,s4}; 
		//DOUBT :HOW TO ASSIGN VALUES TO THIS S[]
		/* for(int j =0;j<4; j++) {
				System.out.print(s[j] + " ");
			}*/
		 
		 //2D ARRAY
		 int a[]= {2,3,4};
		 int b[]= {4,7,6};
		 int c[]= {4,0,9};

		 int d[][]= {a,b,c};
		 for(int k=0;k<3;k++) //for row
		 {
			 
			 for(int l=0;l<3;l++) //for column
			 {
		 System.out.print(d[k][l]+ "  ");
		 
		 }
			 System.out.println(); //new line after printing one row
		 }
		 
		 System.out.println(d[2][1]);
		 
		 /* now for printing array of different sizes (JAGGED ARRAYS)
		  * for eg 
		  * 1,2,3,4
		  * 2,4,6
		  * 5,6,7,8,9
		  * */
		 int e[][]= {{1,2,3,4},{2,4,6},{5,6,7,8,9}};
		 for(int m=0;m<e.length;m++) //for row,.length gives number of arrays
		 {
			 
			 for(int n=0;n<e[m].length;n++) //for column,.length for that particular array row length
			 {
		 System.out.print(e[m][n]+ " _");
		 
		 }
			 System.out.println(); //new line after printing one row
		 }
		 
		 //Enhanced for loop for printing array elements 
		 
		 int efl[]= {1,2,3,4};
		 for(int f:efl) //here f acts as hover over a single array element
		 {
			 System.out.println(f);
		 }
		 //Enhanced for loop for printing 2d arrays
		 
		 for(int efl2[]:e)    //here efl2 acts as an array to hover over 2d array
		 {
			 for(int efl3:efl2) //here efl3 acts as hover over a single array element

			 {
				 System.out.print(efl3+ " ");
			 }
			 System.out.println("");
		 }
		 
	}

}
