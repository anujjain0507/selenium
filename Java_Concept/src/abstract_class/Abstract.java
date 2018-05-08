package abstract_class;

public class Abstract {

	public static void main(String[] args) {
		
		school obj = new std_name();//can not create the instantiate the abstract class
		obj.class_room();
		obj.division();
		obj.teacher();
		obj.std();

	}
}
	
abstract class school //Abstract class
	{
		public void std() 
		{
			System.out.println("Welcome to School");
		}
		
		public abstract void  class_room(); //Abstract Method
		public abstract void  teacher();
		public abstract void  division();
	}

abstract class subject extends school
{
	public void class_room()
	{
		System.out.println("This is he Class room");
	}

}

class std_name extends subject			//Concrete 
{

	@Override
	public void teacher() {
		System.out.println("Teachers are : ");
		
	}

	@Override
	public void division() {
		System.out.println("Division is : ");
		
	}
	
}


