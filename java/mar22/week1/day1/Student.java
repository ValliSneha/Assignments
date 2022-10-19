package mar22.week1.day1;

public class Student {
 String name="Sneha";
 int rollno=101;
 public void studentDetail()
 {
	 System.out.println("Name="+name+" "+"Rollno="+rollno);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.studentDetail();

	}

}