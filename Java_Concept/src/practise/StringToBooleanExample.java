package practise;

public class StringToBooleanExample {

	public static void main(String[] args) {
		
		/*	The parseBoolean() method converts string into boolean primitive.
		 * 	The parseBoolean() is the static method of Boolean class.*/
		
		String s1= "true";
		String s2 = "tRue";
		String s3 = "Hi";
		
		boolean b1 = Boolean.parseBoolean(s1);
		boolean b2 = Boolean.parseBoolean(s2);
		boolean b3 = Boolean.parseBoolean(s3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		
		/*	The Boolean.valueOf() method converts string into Boolean object*/
		
		String s4="true";    
		String s5="TRue";    
		String s6="ok";    
		Boolean b4=Boolean.valueOf(s4);    
		Boolean b5=Boolean.valueOf(s5);    
		Boolean b6=Boolean.valueOf(s6);    
		System.out.println(b4);    
		System.out.println(b5);    
		System.out.println(b6);  

	}

}
