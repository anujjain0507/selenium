package string_concept;

public class RemoveSpaceWithouttrim {

	static int i, j, k = 0;

	public static void main(String[] args) {
		String str = "   DataMatics Global Services   ";
		System.out.println(str);
		for (i = 0; i < str.length(); i++) {
			char intialWord = str.charAt(i);
			if (intialWord != ' ')
				break;
		}
		for (j = str.length() - 1; j >= 0; j--) {
			char lastWord = str.charAt(j);
			if (lastWord != ' ')
				break;
		}
		for (k = i; k < j; k++) {
			System.out.print(str.charAt(k));
		}

	}

}
