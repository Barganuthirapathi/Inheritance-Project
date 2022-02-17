package inheritance;

public class MultiLevel extends MultiLevelPc {

	public void childClass() {
		System.out.println("enter the Age of child");
	}
	public static void main(String[] args) {
    	MultiLevel m = new MultiLevel();
    	m.grandParent();
    	m.parentClass();
    	m.childClass();
    }
}
	
