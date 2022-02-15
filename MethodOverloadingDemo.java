
class Casio{
	 
	public void add(int i, int j) {
		System.out.println(i+j);
	}
	public void add(int i, int j, int k) {
		System.out.println(i+j+ k);
	}
	
	/*public Casio(int i, int j, String op) {
		int num1= i;
		int num2=j;
		String operation = op;
		
		
	}*/
	
}



public class MethodOverloadingDemo {

	public static void main(String[] args)
	{
      Casio obj=new Casio();
      obj.add(5, 5, 5);                //calls method according to parameters
      
	}

}
