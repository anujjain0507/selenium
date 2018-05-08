package Test;


public class finally_concept {
	
	public static void main(String[] args) {
//		Test2();
		division();
	}
	
	public static void Test1() {
		try {
			System.out.println("inside Test1 method");
			throw new RuntimeException("test");
			} 
		catch(Exception e) 
		{
		System.out.println("inside catch block");
		}
		finally 
		{
			System.out.println("inside finally block");
		}

}
	
	public static void Test2()
	{
		try {
		System.out.println("inside Test2");
		}
		finally {
			System.out.println("finally code in test2 ");
		}
	}
	
	public static void division()
	{
		int i =10;
		try {
			System.out.println("Inside try block");
			int k=i/0;
		}
		catch(Exception e)
		{
			System.out.println("Inside the catch block");
			System.out.println("Divide by zero");
		}
		finally
		{
			System.out.println("execute this code even after any exception");
		}
	}
	
}
