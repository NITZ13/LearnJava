class Addition{
	public int add(int...n)  // input here will be array of parameters
	{
		int sum=0;
		for(int j:n) {
			sum=sum+j;
		}
		return sum;
		
	}
}


public class VarargsDemo {

	public static void main(String[] args) {
     Addition obj=new Addition();
	System.out.println(obj.add(2,3,4,4,1));//this will go ip as array to add method
	}
	

}
