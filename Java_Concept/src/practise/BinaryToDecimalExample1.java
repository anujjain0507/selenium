package practise;

public class BinaryToDecimalExample1 {

	public static void main(String[] args) {
		String binarystring = "10101";
		int decimal = Integer.parseInt(binarystring,2);//Integer.parseInt() method converts string to int with given redix
		System.out.println(decimal);

	}

}
