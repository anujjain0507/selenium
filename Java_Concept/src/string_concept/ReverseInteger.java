package string_concept;

public class ReverseInteger {

	public static void main(java.lang.String[] args) {
		int number = 123456789;
		
		int rev =0;
		
		while(number!=0) {
			rev = rev*10+number%10;
		}
		
		System.out.println(rev);

	}

}
