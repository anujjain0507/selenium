package practise;

public class IntToDoubleExample2 {
	public static void main(String [] args)
	{
		int i = 200;
		Double d = new Double(i);//First Way
		System.out.println(d);
		Double d2 = Double.valueOf(i);
		System.out.println(d2);
	}

}
