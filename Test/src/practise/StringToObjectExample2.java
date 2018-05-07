package practise;

public class StringToObjectExample2 {

	public static void main(String[] args) throws ClassNotFoundException  {
		Class c =  Class.forName("StringToObjectExample2");
		System.out.println("class Name "+c.getName());
		System.out.println("Supar calss name " + c.getSuperclass().getName());

	}

}
