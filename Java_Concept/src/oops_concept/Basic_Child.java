package oops_concept;

public class Basic_Child extends Basic_Parent {
	
	Basic_Child(){
		System.out.println("I am basic child constructor");
	}

	public void C() {
		System.out.println("I am child class-->Method C");
	}
	
	public void D() {
		System.out.println("I am child class-->Method D");
	}
	
	@Override
	void E() {
		System.out.println("I am the abstract method");
		
	}
	

	public static void main(String[] args) {
		Basic_Child b = new Basic_Child();
		b.A();
		b.B();
		b.C();
		b.D();
		b.E();
		
//		Basic_Parent c = new Basic_Child();
//		c.A();
//		c.B();
//		

	}

	
}
