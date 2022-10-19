package mar22.week1.day1;

public class mobile {
	public void makeCall()
	{
		System.out.println("Making a call");
	}
	public void sendMsg()
	{
		System.out.println("Sending a Message");
	}

	public static void main(String[] args) {
		mobile m=new mobile();
		m.makeCall();
		m.sendMsg();

	}

}
