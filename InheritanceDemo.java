class Calci //SUPER  class,which is inherited by some sub class
{
	public int add(int i,int j) {
		return (i+j);
	}
}

/*Suppose scenario is such that after after giving customer object for calci add,our class src code got destroyed.
 * now the customer after sometime wants subtraction functionality too
 * so we write another Class CalcAdv with both add,sub method as our prev class got destroyed
 * but in doin so we had to write add functionality twice in Calciadv as well which is code redundancy
 * so to not rewrite add method of Calci,we will inherit its method add :INHERITANCE
 * using "extends"
 * */
/*class CalcAdv{
	public int add(int i,int j) {
		return (i+j);
	}
	public int sub(int i,int j) {
		return (i-j);
	}
}*/

class CalcAdv extends Calci //SUB class:here along with calci methods cacladv has its own methods aswell
{
	public int sub(int i,int j) {
		return (i-j);
	}
}

class CalcVeryAdv extends CalcAdv //two level heritancee
{
	public int mul(int i,int j) {
		return (i*j);
	}
	public int div(int i,int j) {
		return (i/j);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {

		CalcAdv obj= new CalcAdv();
		System.out.println(obj.add(5, 4));
		
		CalcVeryAdv obj2= new CalcVeryAdv();
		System.out.println(obj2.add(1, 0));
		System.out.println(obj2.sub(5, 4));
		System.out.println(obj2.mul(9, 8));
		System.out.println(obj2.div(35, 5));
		
		
	}

}
