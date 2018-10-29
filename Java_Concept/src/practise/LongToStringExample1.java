package practise;

public class LongToStringExample1 {

	public static void main(String[] args) {
		Long l = 123456789756121546L;
		String s = String.valueOf(l);//using String.valueOf()
		String s1= Long.toString(l);//using Long.toString()
		System.out.println(s);
		System.out.println(s1);

	}

}
