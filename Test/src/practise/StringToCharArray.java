package practise;

public class StringToCharArray {

	public static void main(String[] args) {
		String str = "ANUJ JAIN";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("char at "+i+" index is: "+ch[i]);
		}

	}

}
