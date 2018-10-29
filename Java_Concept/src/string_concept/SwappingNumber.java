package string_concept;

public class SwappingNumber {

	public static void main(String[] args) {
		int a= 2;
		int b= 3;
		System.out.println("Before swapping " + a + " and " +b );
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("After swapping " + a + " and " +b );

	}

}
