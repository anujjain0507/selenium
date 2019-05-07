package string_concept;

public class AddNumberInString {

	public static void main(String[] args) {
		int sum = 0;
		String input = "12glf;kg;25;dlf15";
		String Number = input.replaceAll("[^0-9.]", "");
		System.out.println("The Numbers are : " + Number);
		String[] num = Number.split("");
		
		for(String str : num) {
			int n = Integer.parseInt(str);
			sum = sum + n;
		}
		System.out.println("Sum of all Number is : " + sum);
	}
}
