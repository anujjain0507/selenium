package string_concept;

public class RemoveCharacter {

	public static void main(String[] args) {
		String str1 = "example.com";
		String str2 = "example.com";
		System.out.println(str1.compareTo(str2));
		String str = str1.concat(str2);
		System.out.println(str);
		int result = str1.compareTo(str2);
		if (result < 0) {
			System.out.println(str1 + " is less then " + str2);
		} else if (result == 0) {
			System.out.println(str1 + " is equal to " + str2);
		} else {
			System.out.println("\"" + str1 + "\"" + " is Greater then " + "\"" + str2 + "\"");
		}
		// String str2 = str.replace("", "\n");
		// System.out.println(str.charAt(0));
		// System.out.println(str.charAt(10));
		// System.out.println(str.codePointCount(1, 9));

		// System.out.print(str2);

	}

}
