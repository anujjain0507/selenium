package practise;

public class ObjectToString {

	public static void main(String[] args) {
	Emp e = new Emp();
	String str = e.toString(); //using toString()
	System.out.println(str);
	String str1 = String.valueOf(e);
	System.out.println(str1);

	}

}
class Emp {
	
}