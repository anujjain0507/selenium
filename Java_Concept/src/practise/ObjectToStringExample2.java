package practise;

public class ObjectToStringExample2 {

	public static void main(String[] args) {
		String str = "Hello";
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();//converting StringBuilder to String  
		System.out.println("String is " +str);
		System.out.println("Revese String is " + rev);

	}

}
