package Collections;

public class Student 

{
	
	private int sno = 1744 ;
	private String sname = "sirisha";
	
	
	public int getSno() {
		return sno;
	}


	public String getSname() {
		return sname;
	}

	
	public void setSno(int sno) {
		this.sno = sno;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public static void main(String[] args) 
	
	{
		Student s1 = new Student();
		System.out.println( s1.sno);
		System.out.println(s1.sname);

	}

}
