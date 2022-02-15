class StudentE{
	//Private variable because it should be accessible only via method in class ie ENCAPSULATED
	private int roll_no;
	private String sname;
	//BINDING DATA WITH METHODS : ENCAPSULATION
	// GETTERS AND SETTER USING ECLIPSE
	//SOURCE> GEN GETTERS AND SETTERS> SELECT ALL> OK
	public int getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	//GETTERS AND SETTERS USING HARDCODING
	/* public void setRollNo(int r) {
		roll_no=r;
	}
	public void setSname(String s) {
		sname=s;
	}
	public int getRollNo(int r) {
		return roll_no;
	}
	public String getSname(String s) {
		return sname;
	}*/
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
        StudentE s1= new StudentE();
        //can be only set via method and not by explicitly using variable
        s1.setSname("John");
        s1.setRoll_no(55);
        System.out.println(s1.getRoll_no());
        System.out.println(s1.getSname());

        
        
	}

}
