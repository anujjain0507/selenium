package abstract_class;

public class Abstract_exam_2 {

	public static void main(String[] args) {
		Iphone obj = new Iphone();
		show(obj);

	}
	public static void show(Iphone obj)
	{
		obj.showConfig();
	}
	

}

abstract class phone
{
	public abstract void showConfig();
	
}

class Iphone{
	public void showConfig() {
		System.out.println("2GB,2018, IOS 10.0");
	}
	
}

class SamsungS4{
	public void showConfig() {
		System.out.println("2GB,2018,Kitkat");
	}
}