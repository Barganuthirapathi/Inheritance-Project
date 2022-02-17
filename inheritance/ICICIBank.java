package inheritance;

public class ICICIBank extends RBIClass{
	public void panNumber() {
		System.out.println("enter the Pan number");
	}
    public static void main(String[] args) {
		ICICIBank b=new ICICIBank();
		b.adhaarDetails();
        b.panNumber();
	}

}
