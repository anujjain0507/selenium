package ipp;



public class ReadExcel {

	public void display()
	{
		System.out.println("Connection Opened");//3
	}
	void run()
	{
		String s = null;
	try {
		
		String s1= s.toString();
		System.out.println(s1);
	} 
	catch (NoSuchFieldError e2) {
		System.out.println("Exception Handelled here");//1
	}

	finally
	{
		System.out.println("Connection Closed");//2
	}
	}
	
	public static void main(String[] args) {
		
		ReadExcel re = new ReadExcel();
		re.display();
		re.run();	
	}

}
