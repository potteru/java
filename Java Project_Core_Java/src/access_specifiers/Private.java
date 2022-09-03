package access_specifiers;

public class Private {
	
	// private variable
	private int a;
	
	// constructor
	private Private(){
		a = 10;
	}
	
	// private method
	private void m1() {
		System.out.println("Private method");
	}
	
	public static void main(String[] args) {
		
		Private p = new Private();
		System.out.println(p.a);	//
		p.m1();
	}

}
