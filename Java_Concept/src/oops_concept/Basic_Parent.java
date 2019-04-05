package oops_concept;

abstract class Basic_Parent {
	
	public Basic_Parent()
	{
		System.out.println("I am Basic parent Constructor");
	}
	
	public void A(){
		System.out.println("I am parent class-->Method A");
	}
	
	public void B() {
		System.out.println("I am parent class-->Method B");
	}
	
	abstract void E() ;
	
//	public static void main(String[] args) {
//		Basic_Parent a = new Basic_Parent();
//		a.A();
//		a.B();
//	}


}
