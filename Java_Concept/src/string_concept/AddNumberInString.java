package string_concept;

public class AddNumberInString {

	public static void main(String[] args) {
		String input = "12glf;kg;25;dlf15";
		String number = input.replaceAll("[^0-9.]", "");
		String num [] = number.split("");
		int sum = 0;
		for(String str : num) {
			int n = Integer.parseInt(str);
			sum =sum +n;
		}
		System.out.println(sum);

	}

}
