package abstract_class;

public class TestCar {

	public static void main(String[] args) {
		System.out.println(Car.speed);
		
		BMW bmw = new BMW();
		bmw.Engine();
		bmw.Run();
		bmw.Fuel();
		bmw.Speed();
		

		
		System.out.println("****************************************");
//		Child class object can be refered by Parent Interface references var. called Dynamic Polymorphism
		
		Car car = new Honda();
		car.Run();
		car.Engine();
//		car.Speed();
		car.Fuel();
		

	}

}
