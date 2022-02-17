package inheritance;

public class HDFCBank extends RBIClass {
	public void panNumber() {
		System.out.println("enter the Pan number");
	}
    public static void main(String[] args) {
		HDFCBank b=new HDFCBank();
		b.adhaarDetails();
		b.panNumber();
        
}
}