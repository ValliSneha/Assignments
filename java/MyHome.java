import Day2.Assignments.PublicPark;
public class MyHome {
private String bed="queen";
public void bedRoom()
{
	System.out.println(bed);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicPark pp=new PublicPark();
		MyHome mh=new MyHome();
		mh.bedRoom();
		System.out.println(pp.swing);
		System.out.println(pp.playground);
		System.out.println("End of the program");
		

	}

}
