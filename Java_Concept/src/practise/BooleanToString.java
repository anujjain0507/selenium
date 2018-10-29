package practise;

public class BooleanToString {

	public static void main(String[] args) {
		
//		The String.valueOf() method converts boolean to String. The valueOf() is the static method of String class.
		
		boolean b1 = true;
		boolean b2 = false;
		String str1 = String.valueOf(b1);
		String str2 = String.valueOf(b2);
		System.out.println(str1);
		System.out.println(str2);
		
//		The Boolean.toString() method converts boolean to String. The toString() is the static method of Boolean class.
		
		boolean b3 = true;
		boolean b4 = false;
		String str3 = Boolean.toString(b3);
		String str4 = Boolean.toString(b4);
		System.out.println(str3);
		System.out.println(str4);

	}

}
