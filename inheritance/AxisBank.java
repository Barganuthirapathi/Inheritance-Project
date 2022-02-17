package inheritance;

public class AxisBank extends RBIClass{
	public void panNumber() {
		System.out.println("enter the Pan number");
	}

	public static void main(String[] args) {
		AxisBank b=new AxisBank();
		b.adhaarDetails();
		b.panNumber();

	}
}
