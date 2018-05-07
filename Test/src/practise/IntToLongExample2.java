package practise;

public class IntToLongExample2 {

	public static void main(String[] args) {
		int i = 200;
		long l = new Long(i);//First way
		System.out.println(l);
		long l2 = Long.valueOf(i);//second way
		System.out.println(l2);

	}

}
