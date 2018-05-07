package practise;

public class CharToIntExample1 {

	public static void main(String[] args) {
		
/* We can convert char to int in java using various ways. 
 * If we direct assign char variable to int, 
 * it will return ASCII value of given character.
 * 
 * 
 * If char variable contains int value, 
 * we can get the int value by calling Character.getNumericValue(char) method.
 * 
 *  
 * Alternatively, we can use String.valueOf(char) method.
 * */
		
		char char1 = 'a';
		char char2 = '1';
		int i = char1;
		int i2 = char2;
		System.out.println(i);//Return ASCII Value
		System.out.println(i2);

/* Let's see the simple code to convert char to int in java using Character.
 * getNumericValue(char) method which returns an integer value.
 */

		char char3 ='1';
		int a = Character.getNumericValue(char3);
		System.out.println(a);
		
		
/* Let's see another example which returns integer value of specified char value 
 * using String.valueOf(char) method.
 */
		char char4 = '2';
		int a2 =Integer.parseInt(String.valueOf(char4));
		System.out.println(a2);
		

	}

}
