package practise;

public class CharToStringExample1 {

	public static void main(String[] args) {
		char c = 'A';
		String str = String.valueOf(c);//String.valueOf() 
		System.out.println(str);
		String str1 = Character.toString(c);
		System.out.println(str1);

	}

}
