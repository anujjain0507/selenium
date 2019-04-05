package abstract_class;

public abstract class Employee {
	
	private String name;
	private int paymentPerHour;
	
	public Employee(String name,int paymentPerHour) {
		this.name=name;
		this.paymentPerHour=paymentPerHour;
	}
	
	public abstract int calculateSalary();
	
	public String getName() {
		return name;
	}
	
	public int getpaymentPerHour() {
		return paymentPerHour;
	}
	
	public void setpaymentPerHour(int paymentPerHour) {
		this.paymentPerHour= paymentPerHour;
	}

}
