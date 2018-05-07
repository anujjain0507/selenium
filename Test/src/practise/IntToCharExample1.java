package practise;

public class IntToCharExample1 {

	public static void main(String[] args) {
		
	/* We can convert int to char in java using typecasting. 
	 * To convert higher data type into lower, we need to perform typecasting. 
	 * Here, the ASCII character of integer value will be stored in the char variable.*/
		
		int a = 65;
		char char1 = (char)a;
		System.out.println(char1);//Return ASCII Value
		
	/* But if you store 1, it will store ASCII character of given number 
	 * which is start of heading which is not printable. 
	 * So it will not print anything on the console.*/
		
		int b = 1;
		char char2 = (char)b;
		System.out.println(char2);
		
	/*If you add '0' with int variable, it will return actual value in the char variable. 
	 * The ASCII value of '0' is 48. So, if you add 1 with 48, it becomes 49 which is equal to 1. 
	 * The ASCII character of 49 is 1.*/
		
		int c = 2;
		char char3 = (char)(c+'0');
		System.out.println(char3);
		
		
	/*If you store integer value in a single quote, it will store actual character in char variable.*/
		int d = '2';
		char char4 = (char)d;
		System.out.println(char4);
		
		
	/*To get the actual value, you can also use Character.forDigit() method.*/
		
		int REDIX = 10;//redix 10 is for decimal number, for hexa use redix 16
		int e = 1;
		char char5 = Character.forDigit(e, REDIX);
		System.out.println(char5);
		
	/*To get the hexa value, use redix 16 in Character.forDigit() method..*/
		
		int REDIX1 = 16;//redix 10 is for decimal number, for hexa use redix 16
		int f = 13;
		char char6 = Character.forDigit(f, REDIX1);
		System.out.println(char6);	

	}

}
