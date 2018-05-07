package practise;

public class intToStringExample3 {

	public static void main(String[] args) {
		int i =100;
		String str = String.valueOf(i);//String.valueOf()
		String str1 = Integer.toString(i+100);//Integer.toString()
		String str3 = String.format("%d",i);//String.format()
		System.out.println(str+100);
		System.out.println(str1+100);
		System.out.println(str3);

	}

}
